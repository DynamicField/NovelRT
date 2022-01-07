// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#include <NovelRT.Interop/NrtErrorHandling.h>
#include <NovelRT.Interop/NrtNovelRunner.h>
#include <NovelRT.h>

#include <list>

using namespace NovelRT;

std::list<std::shared_ptr<Input::InteractionService>> _interactionCollection;
std::list<std::shared_ptr<Windowing::WindowingService>> _windowingCollection;
#ifdef NOVELRT_INK
std::list<std::shared_ptr<DotNet::RuntimeService>> _runtimeCollection;
#endif
std::list<std::shared_ptr<Graphics::RenderingService>> _rendererCollection;
std::list<std::shared_ptr<DebugService>> _debugServiceCollection;

#ifdef __cplusplus
extern "C"
{
#endif

    NrtNovelRunnerHandle Nrt_NovelRunner_create(int32_t displayNumber)
    {
        NovelRunner* runner = new NovelRunner(displayNumber);
        return reinterpret_cast<NrtNovelRunnerHandle>(runner);
    }

    NrtNovelRunnerHandle Nrt_NovelRunner_createCustom(int32_t displayNumber,
                                                      const char* windowTitle,
                                                      NrtWindowMode windowMode,
                                                      uint32_t targetFrameRate)
    {
        NovelRunner* runner = new NovelRunner(displayNumber, windowTitle,
                                              static_cast<Windowing::WindowMode>(windowMode), targetFrameRate);
        return reinterpret_cast<NrtNovelRunnerHandle>(runner);
    }

    NrtResult Nrt_NovelRunner_runNovel(NrtNovelRunnerHandle runner)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        cRunner->runNovel();
        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_destroy(NrtNovelRunnerHandle runner)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);

        cRunner->~NovelRunner();
        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_getInteractionService(NrtNovelRunnerHandle runner,
                                                    NrtInteractionServiceHandle* outputService)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (outputService == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        _interactionCollection.push_back(cRunner->getInteractionService());

        auto ptr = _interactionCollection.back().get();
        if (ptr == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }
        *outputService = reinterpret_cast<NrtInteractionServiceHandle>(ptr);

        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_getWindowingService(NrtNovelRunnerHandle runner, NrtWindowingServiceHandle* outputService)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (outputService == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        _windowingCollection.push_back(cRunner->getWindowingService());

        auto ptr = _windowingCollection.back().get();
        if (ptr == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }
        *outputService = reinterpret_cast<NrtWindowingServiceHandle>(ptr);

        return NRT_SUCCESS;
    }

#ifdef NOVELRT_INK
    NrtResult Nrt_NovelRunner_getRuntimeService(NrtNovelRunnerHandle runner, NrtRuntimeServiceHandle* outputService)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (outputService == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        _runtimeCollection.push_back(cRunner->getDotNetRuntimeService());

        auto ptr = _runtimeCollection.back().get();
        if (ptr == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }
        *outputService = reinterpret_cast<NrtRuntimeServiceHandle>(ptr);

        return NRT_SUCCESS;
    }
#endif

    NrtResult Nrt_NovelRunner_getRenderer(NrtNovelRunnerHandle runner, NrtRenderingServiceHandle* outputService)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (outputService == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        _rendererCollection.push_back(cRunner->getRenderer());

        auto ptr = _rendererCollection.back().get();
        if (ptr == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }
        *outputService = reinterpret_cast<NrtRenderingServiceHandle>(ptr);

        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_getDebugService(NrtNovelRunnerHandle runner, NrtDebugServiceHandle* outputService)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (outputService == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        _debugServiceCollection.push_back(cRunner->getDebugService());

        auto ptr = _debugServiceCollection.back().get();
        if (ptr == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }
        *outputService = reinterpret_cast<NrtDebugServiceHandle>(ptr);

        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_SubscribeToUpdate(NrtNovelRunnerHandle runner,
                                                void (*func)(NrtTimestamp, void*),
                                                void* context,
                                                NrtAtom* eventHandlerId)
    {
        using namespace NovelRT::Utilities;

        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (func == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);

        auto eventHandler = EventHandler<Timing::Timestamp>(
            [func, context](Timing::Timestamp delta) { func(reinterpret_cast<NrtTimestamp&>(delta), context); });
        if (eventHandlerId != nullptr)
        {
            *eventHandlerId = eventHandler.getId();
        }
        cRunner->Update += eventHandler;

        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_UnsubscribeFromUpdate(NrtNovelRunnerHandle runner, NrtAtom eventHandlerId)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);

        cRunner->Update -= Atom(eventHandlerId);

        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_SubscribeToSceneConstructionRequested(NrtNovelRunnerHandle runner,
                                                                    void (*func)(void*),
                                                                    void* context,
                                                                    NrtAtom* eventHandlerId)
    {
        using namespace NovelRT::Utilities;

        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (func == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);

        auto eventHandler = EventHandler<>([func, context]() { func(context); });
        if (eventHandlerId != nullptr)
        {
            *eventHandlerId = eventHandler.getId();
        }
        cRunner->SceneConstructionRequested += eventHandler;
        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested(NrtNovelRunnerHandle runner,
                                                                        NrtAtom eventHandlerId)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);

        cRunner->SceneConstructionRequested -= Atom(eventHandlerId);

        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_getUpdateEvent(NrtNovelRunnerHandle runner,
                                             NrtUtilitiesEventWithTimestampHandle* outputEvent)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (outputEvent == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        *outputEvent = reinterpret_cast<NrtUtilitiesEventWithTimestampHandle&>(cRunner->Update);
        return NRT_SUCCESS;
    }

    NrtResult Nrt_NovelRunner_getSceneConstructionEvent(NrtNovelRunnerHandle runner,
                                                        NrtUtilitiesEventHandle* outputEvent)
    {
        if (runner == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
        }

        if (outputEvent == nullptr)
        {
            Nrt_setErrMsgIsNullptrInternal();
            return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
        }

        NovelRunner* cRunner = reinterpret_cast<NovelRunner*>(runner);
        *outputEvent = reinterpret_cast<NrtUtilitiesEventHandle&>(cRunner->SceneConstructionRequested);
        return NRT_SUCCESS;
    }

#ifdef __cplusplus
}
#endif
