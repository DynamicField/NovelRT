#pragma once
// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#include <NovelRT/Graphics/GraphicsBuffer.hpp>
#include <NovelRT/Graphics/GraphicsCmdList.hpp>
#include <NovelRT/Graphics/GraphicsMemoryAllocator.hpp>
#include <NovelRT/Graphics/GraphicsPipelineInputElement.hpp>
#include <NovelRT/Graphics/GraphicsPipelineResourceKind.hpp>
#include <NovelRT/Graphics/GraphicsTexture.hpp>
#include <NovelRT/Graphics/ShaderProgramVisibility.hpp>
#include <NovelRT/Maths/Maths.h>
#include <NovelRT/UI/UIProvider.hpp>
#include <fstream>
#include <imgui.h>

using namespace NovelRT::Graphics;

namespace NovelRT::UI::DearImGui
{
    std::vector<uint8_t> LoadSpv(std::filesystem::path relativeTarget)
    {
        std::filesystem::path finalPath =
            NovelRT::Utilities::Misc::getExecutableDirPath() / "Resources" / "Shaders" / relativeTarget;
        std::ifstream file(finalPath.string(), std::ios::ate | std::ios::binary);

        if (!file.is_open())
        {
            throw NovelRT::Exceptions::FileNotFoundException(finalPath.string());
        }

        size_t fileSize = static_cast<size_t>(file.tellg());
        std::vector<uint8_t> buffer(fileSize);
        file.seekg(0);
        file.read(reinterpret_cast<char*>(buffer.data()), fileSize);
        file.close();

        return buffer;
    }

    struct TexturedVertex
    {
        NovelRT::Maths::GeoVector3F Position;
        NovelRT::Maths::GeoVector2F UV;
    };

    static inline size_t AlignBufferSize(size_t size, size_t alignment)
    {
        return (size + alignment - 1) & ~(alignment - 1);
    }

    static const char* ImGui_GetClipboardText(void* user_data)
    {
        unused(user_data);
        return "placeholder text";
    }

    static void ImGui_SetClipboardText(void* user_data, const char* text)
    {
        unused(user_data);
        unused(text);
    }
    template<typename TBackend> class ImGuiUIProvider final : public UIProvider<TBackend>
    {
    private:
        ImGuiContext* _imguiContext;
        Threading::VolatileState _state;
        LoggingService _logger;
        bool _showDemo = true;

        std::shared_ptr<Windowing::IWindowingDevice> _windowingDevice;
        std::shared_ptr<Input::IInputDevice> _inputDevice;
        std::shared_ptr<Graphics::GraphicsTexture<TBackend>> _texture2D;
        std::shared_ptr<Graphics::GraphicsDevice<TBackend>> _graphicsDevice;
        std::shared_ptr<Graphics::GraphicsMemoryAllocator<TBackend>> _memoryAllocator;
        std::shared_ptr<GraphicsResourceMemoryRegion<GraphicsTexture, TBackend>> _texture2DRegion;
        std::shared_ptr<GraphicsPipeline<TBackend>> _pipeline;
        std::shared_ptr<GraphicsPipelineSignature<TBackend>> _pipelineSignature;
        std::array<std::shared_ptr<GraphicsDescriptorSet<TBackend>>, 1> _descriptorSet;
        std::vector<std::vector<std::shared_ptr<GraphicsBuffer<TBackend>>>> _vertexBuffers{};
        size_t _currentOffset;
        std::shared_ptr<GraphicsResourceMemoryRegion<GraphicsBuffer, TBackend>> _currentIndexBufferRegion;

    public:
        ImGuiUIProvider()
            : _imguiContext(nullptr),
              _state(Threading::VolatileState()),
              _logger(LoggingService(NovelRT::Utilities::Misc::CONSOLE_LOG_GFX))
        {
            IMGUI_CHECKVERSION();

            _imguiContext = ImGui::CreateContext();

            static_cast<void>(_state.Transition(Threading::VolatileState::Initialised));

            _vertexBuffers = std::vector<std::vector<std::shared_ptr<GraphicsBuffer<TBackend>>>>
            {
                std::vector<std::shared_ptr<GraphicsBuffer<TBackend>>>{},
                std::vector<std::shared_ptr<GraphicsBuffer<TBackend>>>{},
                std::vector<std::shared_ptr<GraphicsBuffer<TBackend>>>{},
            };
        }

        [[nodiscard]] inline ImGuiContext* GetImGuiContext() const noexcept
        {
            return _imguiContext;
        }

        void Initialise(std::shared_ptr<Windowing::IWindowingDevice> windowingDevice,
                        std::shared_ptr<Input::IInputDevice> inputDevice,
                        std::shared_ptr<Graphics::GraphicsProvider<TBackend>> graphicsProvider,
                        std::shared_ptr<Graphics::GraphicsDevice<TBackend>> graphicsDevice,
                        std::shared_ptr<Graphics::GraphicsMemoryAllocator<TBackend>> memoryAllocator) final

        {
            //return;
            _windowingDevice = windowingDevice;
            _inputDevice = inputDevice;
            _graphicsDevice = graphicsDevice;
            _memoryAllocator = memoryAllocator;

            ImGuiIO& io = ImGui::GetIO();
            io.Fonts->AddFontDefault();
            ImGui::StyleColorsDark();

            io.BackendPlatformUserData = (void*)this;
            io.BackendPlatformName = "NovelRT";
            io.BackendFlags |= ImGuiBackendFlags_HasMouseCursors;
            io.BackendFlags |= ImGuiBackendFlags_HasSetMousePos;
            io.ClipboardUserData = (void*)this;
            io.GetClipboardTextFn = &ImGui_GetClipboardText;
            io.SetClipboardTextFn = &ImGui_SetClipboardText;

            ImGui::GetMainViewport()->PlatformHandleRaw = (void*)windowingDevice->GetHandle();

            io.BackendRendererUserData = (void*)this;
            io.BackendRendererName = "NovelRT";
            io.BackendFlags |= ImGuiBackendFlags_RendererHasVtxOffset;

            uint8_t* pixels;
            int32_t width, height;

            io.Fonts->GetTexDataAsRGBA32(&pixels, &width, &height);

            // Getting Jiggy Wit It - GFX-style
            auto graphicsContext = graphicsDevice->GetCurrentContext();

            
            GraphicsBufferCreateInfo bufferCreateInfo{};
            bufferCreateInfo.cpuAccessKind = GraphicsResourceAccess::Write;
            bufferCreateInfo.gpuAccessKind = GraphicsResourceAccess::Read;
            bufferCreateInfo.size = 64 * 1024 * 4;

            // Create Texture Staging Buffer
            auto textureStagingBuffer = memoryAllocator->CreateBuffer(bufferCreateInfo);

            // Create Command List
            std::shared_ptr<GraphicsCmdList<TBackend>> cmdList = graphicsContext->BeginFrame();

            // Create Graphics Texture
            auto textureCreateInfo = GraphicsTextureCreateInfo{GraphicsTextureAddressMode::Repeat,
                                                               GraphicsTextureKind::TwoDimensional,
                                                               GraphicsResourceAccess::None,
                                                               GraphicsResourceAccess::ReadWrite,
                                                               static_cast<uint32_t>(width),
                                                               static_cast<uint32_t>(height),
                                                               1,
                                                               GraphicsMemoryRegionAllocationFlags::None,
                                                               TexelFormat::R8G8B8A8_UNORM};
            _texture2D = memoryAllocator->CreateTexture(textureCreateInfo);
            
            // Allocate region based on size of texture
            std::shared_ptr<GraphicsResourceMemoryRegion<GraphicsTexture, TBackend>> texture2DRegion =
                _texture2D->Allocate(_texture2D->GetSize(), 4);

            // Create a staging buffer region for texture
            auto textureStagingBufferRegion = textureStagingBuffer->Allocate(_texture2D->GetSize(), 4);

            // Map the texture staging buffer to the texture region
            auto pTextureData = textureStagingBuffer->Map<uint32_t>(texture2DRegion);

            // copy the data from Imgui's "pixels" to the memory of the texture staging buffer
            memcpy(pTextureData.data(), pixels, (width * height) * sizeof(char) * 4);
            // Unmap the staging buffer and write
            textureStagingBuffer->UnmapAndWrite(texture2DRegion);
            // Copy the texture to the GPU
            cmdList->CmdBeginTexturePipelineBarrierLegacyVersion(_texture2D);
            cmdList->CmdCopy(_texture2D, textureStagingBufferRegion);
            cmdList->CmdEndTexturePipelineBarrierLegacyVersion(_texture2D);

            graphicsContext->EndFrame();
            graphicsDevice->Signal(graphicsContext->GetFence());
            graphicsDevice->WaitForIdle();

            //Stash the texture 2d region for retrieval later
            io.Fonts->SetTexID(reinterpret_cast<ImTextureID>(&_texture2DRegion));

            auto vertShaderData = LoadSpv("imgui_vert.spv");
            auto pixelShaderData = LoadSpv("imgui_frag.spv");

            std::vector<GraphicsPipelineInputElement> elem{
                GraphicsPipelineInputElement(typeid(NovelRT::Maths::GeoVector2F),
                                             GraphicsPipelineInputElementKind::Position, 8),
                GraphicsPipelineInputElement(typeid(NovelRT::Maths::GeoVector2F),
                                             GraphicsPipelineInputElementKind::Normal, 8),
                GraphicsPipelineInputElement(typeid(NovelRT::Maths::GeoVector4F),
                                             GraphicsPipelineInputElementKind::TextureCoordinate, 16)};

            std::vector<GraphicsPushConstantRange> pushConstants{
                GraphicsPushConstantRange{ShaderProgramVisibility::Vertex, 0, sizeof(float) * 4},
            };

            std::vector<GraphicsPipelineInput> in{GraphicsPipelineInput(elem)};
            std::vector<GraphicsPipelineResource> res{
                GraphicsPipelineResource(GraphicsPipelineResourceKind::Texture, ShaderProgramVisibility::Pixel)};

            auto signature = graphicsDevice->CreatePipelineSignature(GraphicsPipelineBlendFactor::SrcAlpha,
                                                                     GraphicsPipelineBlendFactor::OneMinusSrcAlpha, in,
                                                                     res, pushConstants);
            auto vertShaderProg =
                graphicsDevice->CreateShaderProgram("main", ShaderProgramKind::Vertex, vertShaderData);
            auto pixelShaderProg =
                graphicsDevice->CreateShaderProgram("main", ShaderProgramKind::Pixel, pixelShaderData);
            auto pipeline = graphicsDevice->CreatePipeline(signature, vertShaderProg, pixelShaderProg);
            
            //Cache what needs caching
            _pipeline = pipeline;
            _pipelineSignature = signature;
            _texture2DRegion = texture2DRegion;
        }

        void BeginFrame(double deltaTime) final
        {
            //return;
            ImGuiIO& io = ImGui::GetIO();

            auto windowSize = _windowingDevice->GetSize();
            io.DisplaySize = ImVec2(windowSize.x, windowSize.y);

            if ((windowSize.x > 0) && (windowSize.y > 0))
            {
                io.DisplayFramebufferScale = ImVec2(1, 1);
            }

            io.DeltaTime = (float)deltaTime;

            // TODO: Update input data

            ImGui::NewFrame();

            ImGui::ShowDemoWindow(&_showDemo);
            // ImGui::Begin("Hello, World!");
            // ImGui::Text("I'm cooked broski");
            // ImGui::End();
        }

        void EndFrame() final
        {
            //return;
            ImGui::EndFrame();
        }

        void UploadImguiGpuData(std::shared_ptr<GraphicsContext<TBackend>> context,
                                std::shared_ptr<GraphicsCmdList<TBackend>> cmdList)
        {
            return;
            _vertexBuffers[context->GetIndex()].clear();

            ImGui::Render();
            ImDrawData* drawData = ImGui::GetDrawData();
            auto io = ImGui::GetIO();

            // Early escape
            if (drawData->TotalVtxCount <= 0)
                return;

            size_t vertexSize = drawData->TotalVtxCount * sizeof(ImDrawVert);
            size_t indexSize = drawData->TotalIdxCount * sizeof(ImDrawIdx);

            // Create buffers
            GraphicsBufferCreateInfo bufferCreateInfo{};
            bufferCreateInfo.cpuAccessKind = GraphicsResourceAccess::Write;
            bufferCreateInfo.gpuAccessKind = GraphicsResourceAccess::Read;
            bufferCreateInfo.size = vertexSize;
            auto vertexStagingBuffer = _memoryAllocator->CreateBuffer(bufferCreateInfo);

            bufferCreateInfo.bufferKind = GraphicsBufferKind::Vertex;
            bufferCreateInfo.cpuAccessKind = GraphicsResourceAccess::None;
            bufferCreateInfo.gpuAccessKind = GraphicsResourceAccess::Write;
            auto vertexBuffer = _memoryAllocator->CreateBuffer(bufferCreateInfo);

            // Create index buffer + staging
            bufferCreateInfo.bufferKind = GraphicsBufferKind::Default;
            bufferCreateInfo.cpuAccessKind = GraphicsResourceAccess::Write;
            bufferCreateInfo.gpuAccessKind = GraphicsResourceAccess::Read;
            bufferCreateInfo.size = indexSize;
            auto indexStagingBuffer = _memoryAllocator->CreateBuffer(bufferCreateInfo);

            bufferCreateInfo.bufferKind = GraphicsBufferKind::Index;
            bufferCreateInfo.cpuAccessKind = GraphicsResourceAccess::None;
            bufferCreateInfo.gpuAccessKind = GraphicsResourceAccess::Write;
            auto indexBuffer = _memoryAllocator->CreateBuffer(bufferCreateInfo);

            // Allocate buffers
            auto vertexBufferRegion = vertexBuffer->Allocate(vertexSize, 64);
            auto vertexStageBufferRegion = vertexStagingBuffer->Allocate(vertexSize, 64);
            auto indexBufferRegion = indexBuffer->Allocate(indexSize, 64);
            auto indexStageBufferRegion = indexStagingBuffer->Allocate(indexSize, 64);

            // Map vertex buffer to region
            auto pVertexBuffer = vertexStagingBuffer->Map<ImDrawVert>(vertexBufferRegion);
            // Map index buffer to region
            auto pIndexbuffer = indexStagingBuffer->Map<ImDrawIdx>(indexBufferRegion);

            int32_t vertInitial = 0;
            int32_t indexInitial = 0;

            // Slamjam the vertex buffer and index buffer data into their regions :|
            for (int i = 0; i < drawData->CmdListsCount; i++)
            {
                ImDrawList* list = drawData->CmdLists[i];

                // Copy vertex and index data
                memcpy(pVertexBuffer.data() + vertInitial, list->VtxBuffer.Data,
                       list->VtxBuffer.Size * sizeof(ImDrawVert));
                memcpy(pIndexbuffer.data() + indexInitial, list->IdxBuffer.Data,
                       list->IdxBuffer.Size * sizeof(ImDrawIdx));

                vertInitial += list->VtxBuffer.Size;
                indexInitial += list->IdxBuffer.Size;
            }

            // Unmap the buffers and copy them into their regions for GPU-ity
            vertexStagingBuffer->UnmapAndWrite(vertexBufferRegion);
            indexStagingBuffer->UnmapAndWrite(indexBufferRegion);
            cmdList->CmdCopy(vertexBufferRegion, vertexStageBufferRegion);
            cmdList->CmdCopy(indexBufferRegion, indexStageBufferRegion);

            // This seems terrible but I want it working before I refactor it
            int32_t globalVertexOffset = 0;
            int32_t globalIndexOffset = 0;

            ImVec2 clippingOffset = drawData->DisplayPos;
            ImVec2 clippingScale = drawData->FramebufferScale;

            // Bind the Vertex Buffers and the index buffer(s)?
            std::array<std::shared_ptr<GraphicsBuffer<TBackend>>, 1> buffers{vertexBuffer};
            _currentOffset = vertexBufferRegion->GetOffset();
            _currentIndexBufferRegion = indexBufferRegion;

            _vertexBuffers[context->GetIndex()].emplace_back(vertexBuffer);
            _vertexBuffers[context->GetIndex()].emplace_back(indexBuffer);
        }

        void Render(std::shared_ptr<GraphicsContext<TBackend>> context,
                    std::shared_ptr<GraphicsCmdList<TBackend>> cmdList,
                    std::shared_ptr<Graphics::GraphicsPipeline<TBackend>> pipeline) final
        {
            return;
            ImDrawData* drawData = ImGui::GetDrawData();
            if (drawData->TotalVtxCount <= 0)
                return;

            // Avoid rendering when minimized, scale coordinates for retina displays (screen coordinates != framebuffer coordinates)
            int32_t fb_width = (int32_t)(drawData->DisplaySize.x * drawData->FramebufferScale.x);
            int32_t fb_height = (int32_t)(drawData->DisplaySize.y * drawData->FramebufferScale.y);
            if (fb_width <= 0 || fb_height <= 0)
                return;

            ImVec2 clippingOffset = drawData->DisplayPos;
            ImVec2 clippingScale = drawData->FramebufferScale;
            int32_t globalVertexOffset = 0;
            int32_t globalIndexOffset = 0;
            std::array<std::shared_ptr<GraphicsBuffer<TBackend>>, 1> buffers{
                _vertexBuffers[context->GetIndex()][_vertexBuffers[context->GetIndex()].size() - 2]};
            std::array<size_t, 1> offsets{_currentOffset};

            cmdList->CmdBindPipeline(_pipeline);
            cmdList->CmdBindVertexBuffers(0, 1, buffers, offsets);
            cmdList->CmdBindIndexBuffer(
                _currentIndexBufferRegion,
                Graphics::IndexType::UInt16); // ImGui provides Uint16, but this could work with uint32 too

            // Setup PushConstants
            float scale[2];
            scale[0] = 2.0f / drawData->DisplaySize.x;
            scale[1] = 2.0f / drawData->DisplaySize.y;
            float translate[2];
            translate[0] = -1.0f - drawData->DisplayPos.x * scale[0];
            translate[1] = -1.0f - drawData->DisplayPos.y * scale[1];
            size_t floatSize = sizeof(float) * 2;
            Utilities::Misc::Span<float> scaleSpan(scale);
            Utilities::Misc::Span<float> translateSpan(translate);

            cmdList->CmdPushConstants(_pipelineSignature, ShaderProgramVisibility::Vertex, 0,
                                      Utilities::Misc::SpanCast<uint8_t>(scaleSpan));
            cmdList->CmdPushConstants(_pipelineSignature, ShaderProgramVisibility::Vertex, sizeof(float) * 2,
                                      Utilities::Misc::SpanCast<uint8_t>(translateSpan));
            
            //  Start doing the draw commands
            for (int n = 0; n < drawData->CmdListsCount; n++)
            {
                const ImDrawList* list = drawData->CmdLists[n];
                for (int cmdIndex = 0; cmdIndex < list->CmdBuffer.Size; cmdIndex++)
                {
                    const ImDrawCmd* drawCommand = &list->CmdBuffer[cmdIndex];
                    if (drawCommand->UserCallback != nullptr)
                    {
                        drawCommand->UserCallback(list, drawCommand);
                    }
                    else
                    {

                        // Project scissor/clipping rectangles into framebuffer space
                        ImVec2 clippingMin((drawCommand->ClipRect.x - clippingOffset.x) * clippingScale.x,
                                           (drawCommand->ClipRect.y - clippingOffset.y) * clippingScale.y);
                        ImVec2 clippingMax((drawCommand->ClipRect.z - clippingOffset.x) * clippingScale.x,
                                           (drawCommand->ClipRect.w - clippingOffset.y) * clippingScale.y);

                        // Clamp to viewport as vkCmdSetScissor() won't accept values that are off bounds
                        if (clippingMin.x < 0.0f)
                        {
                           clippingMin.x = 0.0f;
                        }
                        if (clippingMin.y < 0.0f)
                        {
                           clippingMin.y = 0.0f;
                        }
                        if (clippingMax.x > fb_width)
                        {
                           clippingMax.x = (float)fb_width;
                        }
                        if (clippingMax.y > fb_height)
                        {
                           clippingMax.y = (float)fb_height;
                        }
                        if (clippingMax.x <= clippingMin.x || clippingMax.y <= clippingMin.y)
                           continue;

                        // Apply scissor/clipping rectangle
                        cmdList->CmdSetScissor(NovelRT::Maths::GeoVector2F::GeoVector2F(clippingMin.x, clippingMin.y),
                                               NovelRT::Maths::GeoVector2F((clippingMax.x - clippingMin.x),
                                                                           (clippingMax.y - clippingMin.y)));

                        // Bind DescriptorSet with font or user texture
                        auto texture2DRegion = *reinterpret_cast<std::shared_ptr<GraphicsResourceMemoryRegion<GraphicsTexture, TBackend>>*>(
                            drawCommand->GetTexID());
                        std::vector<std::shared_ptr<GraphicsResourceMemoryRegion<GraphicsResource, TBackend>>>
                            inputResourceRegions{
                                std::static_pointer_cast<GraphicsResourceMemoryRegion<GraphicsResource, TBackend>>(
                                    std::shared_ptr<GraphicsResourceMemoryRegion<GraphicsTexture, TBackend>>(
                                        texture2DRegion))};

                        // Specify the descriptor set data
                        auto descriptorSetData = _pipeline->CreateDescriptorSet();
                        descriptorSetData->AddMemoryRegionsToInputs(inputResourceRegions);
                        descriptorSetData->UpdateDescriptorSetData();
                        context->RegisterDescriptorSetForFrame(_pipelineSignature, descriptorSetData);

                        // Bind the descriptor set
                        std::array<std::shared_ptr<GraphicsDescriptorSet<TBackend>>, 1> descriptorData{
                            descriptorSetData};

                        cmdList->CmdBindDescriptorSets(descriptorData);

                        cmdList->CmdDrawIndexed(drawCommand->ElemCount, 1, drawCommand->IdxOffset + globalIndexOffset,
                                                drawCommand->VtxOffset + globalVertexOffset, 0);
                    }
                }
                globalIndexOffset += list->IdxBuffer.Size;
                globalVertexOffset += list->VtxBuffer.Size;
            }

            // Reset clipping rect as per imgui
            cmdList->CmdSetScissor(NovelRT::Maths::GeoVector2F::Zero(),
                                   NovelRT::Maths::GeoVector2F(drawData->DisplaySize.x, drawData->DisplaySize.y));
        }

        ~ImGuiUIProvider() final
        {
            return;
            ImGui::DestroyContext(_imguiContext);
        }
    };
}