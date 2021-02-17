// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#include <NovelRT.Interop/Ecs/NrtCatalogue.h>
#include <NovelRT/Ecs/Catalogue.h>

using namespace NovelRT::Ecs;

extern "C"
{
    NrtCatalogue Nrt_Catalogue_Create(size_t poolId, NrtComponentCache componentCache, NrtEntityCache entityCache)
    {
        auto catalogue = new Catalogue(poolId, *reinterpret_cast<ComponentCache*>(componentCache),
                                       *reinterpret_cast<EntityCache*>(entityCache));
        return reinterpret_cast<NrtCatalogue>(catalogue);
    }

    NrtResult Nrt_Catalogue_GetComponentViewById(NrtCatalogue catalogue,
                                                 NrtComponentTypeId componentId,
                                                 NrtUnsafeComponentView* outputResult)
    {
        if (catalogue == nullptr || outputResult == nullptr)
        {
            return NRT_FAILURE_NULLPTR_PROVIDED;
        }

        auto actualCatalogue = reinterpret_cast<Catalogue*>(catalogue);
        auto returnPtr = new UnsafeComponentView(0, nullptr);
        *returnPtr = actualCatalogue->GetComponentViewById(componentId);
        *outputResult = reinterpret_cast<NrtUnsafeComponentView>(returnPtr);

        return NRT_SUCCESS;
    }

    NrtUnsafeComponentView Nrt_Catalogue_GetComponentViewByIdUnsafe(NrtCatalogue catalogue,
                                                                    NrtComponentTypeId componentId)
    {
        auto actualCatalogue = reinterpret_cast<Catalogue*>(catalogue);

        auto returnPtr = new UnsafeComponentView(0, nullptr);
        *returnPtr = actualCatalogue->GetComponentViewById(componentId);
        return reinterpret_cast<NrtUnsafeComponentView>(returnPtr);
    }

    NrtEntityId Nrt_catalogue_CreateEntity(NrtCatalogue catalogue)
    {
        return reinterpret_cast<Catalogue*>(catalogue)->CreateEntity();
    }

    NrtResult Nrt_Catalogue_DeleteEntity(NrtCatalogue catalogue, NrtEntityId entity)
    {
        if (catalogue == nullptr)
        {
            return NRT_FAILURE_NULLPTR_PROVIDED;
        }

        reinterpret_cast<Catalogue*>(catalogue)->DeleteEntity(entity);

        return NRT_SUCCESS;
    }

    NrtResult Nrt_Catalogue_Destroy(NrtCatalogue catalogue)
    {
        if (catalogue == nullptr)
        {
            return NRT_FAILURE_NULLPTR_PROVIDED;
        }

        delete reinterpret_cast<Catalogue*>(catalogue);

        return NRT_SUCCESS;
    }
}