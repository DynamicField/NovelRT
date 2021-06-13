// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#ifndef NOVELRT_INTEROP_TRANSFORM_H
#define NOVELRT_INTEROP_TRANSFORM_H

#include "NrtTypedefs.h"

#ifdef __cplusplus
extern "C"
{
#endif
#ifndef JNI_TEMPORARY_REMOVAL
    NrtGeoBounds Nrt_Transform_getAABB(const NrtTransform transform); // TODO: why are these const lol?
    NrtGeoBounds Nrt_Transform_getBounds(const NrtTransform transform);
#endif // TODO!

#ifdef __cplusplus
}
#endif

#endif // NOVELRT_INTEROP_TRANSFORM_H
