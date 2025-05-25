#pragma once

// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#include <vulkan/vulkan.h>
#include <NovelRT/Graphics/GraphicsPipelineVisibility.hpp>
#include <NovelRT/Utilities/Misc.h>

namespace NovelRT::Graphics::Vulkan::Utilities
{
    [[nodiscard]] inline VkPipelineStageFlags GetVulkanPipelineStageFlags(Graphics::GraphicsPipelineVisibility stageFlag) noexcept
    {
        VkPipelineStageFlags stageFlags = VK_PIPELINE_STAGE_NONE;

        if ((stageFlag & Graphics::GraphicsPipelineVisibility::VertexInput) == Graphics::GraphicsPipelineVisibility::VertexInput)
        {
            stageFlags |= VK_PIPELINE_STAGE_VERTEX_INPUT_BIT;
        }

        if ((stageFlag & Graphics::GraphicsPipelineVisibility::Transfer) == Graphics::GraphicsPipelineVisibility::Transfer)
        {
            stageFlags |= VK_PIPELINE_STAGE_TRANSFER_BIT;
        }

        return stageFlags;
    }
}
