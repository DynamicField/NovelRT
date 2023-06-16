// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#include <NovelRT.Interop/Ecs/Input/NrtInputSystem.h>
#include <NovelRT.Interop/NrtErrorHandling.h>
#include <NovelRT/Ecs/Ecs.h>

using namespace NovelRT::Ecs;

NrtResult Nrt_InputSystem_FindInScheduler(NrtSystemSchedulerHandle scheduler, NrtInputSystemHandle* outputSystem)
{
    if (scheduler == nullptr)
    {
        Nrt_setErrMsgIsNullInstanceProvidedInternal();
        return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
    }

    if (outputSystem == nullptr)
    {
        Nrt_setErrMsgIsNullArgumentProvidedInternal();
        return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
    }

    try
    {
        auto* sched = reinterpret_cast<SystemScheduler*>(scheduler);
        auto input = sched->GetRegisteredIEcsSystemAs<Input::InputSystem>();
        *outputSystem = reinterpret_cast<NrtInputSystemHandle>(input.get());
    }
    catch (const NovelRT::Exceptions::KeyNotFoundException&)
    {
        Nrt_setErrMsgKeyNotFoundInternal();
        return NRT_FAILURE_KEY_NOT_FOUND;
    }

    return NRT_SUCCESS;
}
NrtResult Nrt_InputSystem_AddMapping(NrtInputSystemHandle system, const char* name, const char* id)
{
    if (system == nullptr)
    {
        Nrt_setErrMsgIsNullInstanceProvidedInternal();
        return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
    }

    if (name == nullptr || id == nullptr)
    {
        Nrt_setErrMsgIsNullArgumentProvidedInternal();
        return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
    }

    auto* sys = reinterpret_cast<Input::InputSystem*>(system);
    sys->AddMapping(name, id);

    return NRT_SUCCESS;
}
NrtResult Nrt_InputSystem_AddDefaultKBMMapping(NrtInputSystemHandle system)
{
    if (system == nullptr)
    {
        Nrt_setErrMsgIsNullInstanceProvidedInternal();
        return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
    }

    auto* sys = reinterpret_cast<Input::InputSystem*>(system);
    sys->AddDefaultKBMMapping();

    return NRT_SUCCESS;
}

NrtResult Nrt_InputSystem_GetMappingId(NrtInputSystemHandle system, const char* mappingName, NrtAtom* outputAtom)
{
    if (system == nullptr)
    {
        Nrt_setErrMsgIsNullInstanceProvidedInternal();
        return NRT_FAILURE_NULL_INSTANCE_PROVIDED;
    }

    if (mappingName == nullptr || outputAtom == nullptr)
    {
        Nrt_setErrMsgIsNullArgumentProvidedInternal();
        return NRT_FAILURE_NULL_ARGUMENT_PROVIDED;
    }

    auto* sys = reinterpret_cast<Input::InputSystem*>(system);
    try
    {
        *outputAtom = sys->GetMappingId(mappingName);
    }
    catch (const std::out_of_range&)
    {
        Nrt_setErrMsgKeyNotFoundInternal();
        return NRT_FAILURE_KEY_NOT_FOUND;
    }

    return NRT_SUCCESS;
}
