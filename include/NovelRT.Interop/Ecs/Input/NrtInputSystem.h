// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#ifndef NOVELRT_INTEROP_ECS_INPUT_NRTINPUTSYSTEM_H
#define NOVELRT_INTEROP_ECS_INPUT_NRTINPUTSYSTEM_H

#include "../../NrtTypedefs.h"

#ifdef __cplusplus
extern "C"
{
#endif

    NrtResult Nrt_InputSystem_FindInScheduler(NrtSystemSchedulerHandle scheduler, NrtInputSystemHandle* outputSystem);
    NrtResult Nrt_InputSystem_AddMapping(NrtInputSystemHandle system, const char* name, const char* id);
    NrtResult Nrt_InputSystem_AddDefaultKBMMapping(NrtInputSystemHandle system);
    NrtResult Nrt_InputSystem_GetMappingId(NrtInputSystemHandle system, const char* mappingName, NrtAtom* outputAtom);

#ifdef __cplusplus
}
#endif

#endif // NOVELRT_INTEROP_ECS_INPUT_NRTINPUTSYSTEM_H
