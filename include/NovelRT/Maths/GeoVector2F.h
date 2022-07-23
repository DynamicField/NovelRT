// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#ifndef NOVELRT_MATHS_GEOVECTOR2_H
#define NOVELRT_MATHS_GEOVECTOR2_H

#ifndef NOVELRT_MATHS_H
#error NovelRT does not support including types explicitly by default. Please include Maths.h instead for the Maths namespace subset.
#endif

namespace NovelRT::Maths
{
    class GeoVector2F
    {
        friend class GeoVector3F;
        friend class GeoVector4F;

    private:
        explicit GeoVector2F(glm::vec2 value) noexcept : x(value.x), y(value.y)
        {
        }

    public:
        float x;
        float y;

        GeoVector2F() noexcept : x(0.0f), y(0.0f)
        {
        }
        GeoVector2F(float x, float y) noexcept : x(x), y(y)
        {
        }

        inline GeoVector2F getNormalised() const noexcept
        {
            return GeoVector2F(glm::normalize(*reinterpret_cast<const glm::vec2*>(this)));
        }

        inline float getMagnitude() const noexcept
        {
            return glm::length(*reinterpret_cast<const glm::vec2*>(this));
        }

        inline float getLength() const noexcept
        {
            return getMagnitude();
        }

        inline bool operator==(GeoVector2F other) const noexcept
        {
            return *reinterpret_cast<const glm::vec2*>(this) == *reinterpret_cast<const glm::vec2*>(&other);
        }

        inline bool operator!=(GeoVector2F other) const noexcept
        {
            return *reinterpret_cast<const glm::vec2*>(this) != *reinterpret_cast<const glm::vec2*>(&other);
        }

        inline bool operator<(GeoVector2F other) const noexcept
        {
            return glm::any(
                glm::lessThan(*reinterpret_cast<const glm::vec2*>(this), *reinterpret_cast<const glm::vec2*>(&other)));
        }

        inline bool operator<=(GeoVector2F other) const noexcept
        {
            return glm::any(glm::lessThanEqual(*reinterpret_cast<const glm::vec2*>(this),
                                               *reinterpret_cast<const glm::vec2*>(&other)));
        }

        inline bool operator>(GeoVector2F other) const noexcept
        {
            return glm::any(glm::greaterThan(*reinterpret_cast<const glm::vec2*>(this),
                                             *reinterpret_cast<const glm::vec2*>(&other)));
        }

        inline bool operator>=(GeoVector2F other) const noexcept
        {
            return glm::any(glm::greaterThanEqual(*reinterpret_cast<const glm::vec2*>(this),
                                                  *reinterpret_cast<const glm::vec2*>(&other)));
        }

        inline GeoVector2F operator+(GeoVector2F other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) + *reinterpret_cast<const glm::vec2*>(&other));
        }

        inline GeoVector2F operator-(GeoVector2F other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) - *reinterpret_cast<const glm::vec2*>(&other));
        }

        inline GeoVector2F operator*(GeoVector2F other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) * *reinterpret_cast<const glm::vec2*>(&other));
        }

        GeoVector2F operator/(GeoVector2F other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) / *reinterpret_cast<const glm::vec2*>(&other));
        }

        inline GeoVector2F operator+(float other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) + other);
        }

        inline GeoVector2F operator-(float other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) - other);
        }

        inline GeoVector2F operator*(float other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) * other);
        }

        GeoVector2F operator/(float other) const noexcept
        {
            return GeoVector2F(*reinterpret_cast<const glm::vec2*>(this) / other);
        }

        inline GeoVector2F& operator+=(GeoVector2F other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) =
                *reinterpret_cast<const glm::vec2*>(this) + *reinterpret_cast<const glm::vec2*>(&other);
            return *this;
        }

        inline GeoVector2F& operator-=(GeoVector2F other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) =
                *reinterpret_cast<const glm::vec2*>(this) - *reinterpret_cast<const glm::vec2*>(&other);
            return *this;
        }

        inline GeoVector2F operator*=(GeoVector2F other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) =
                *reinterpret_cast<const glm::vec2*>(this) * *reinterpret_cast<const glm::vec2*>(&other);
            return *this;
        }

        GeoVector2F operator/=(GeoVector2F other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) =
                *reinterpret_cast<const glm::vec2*>(this) / *reinterpret_cast<const glm::vec2*>(&other);
            return *this;
        }

        inline GeoVector2F operator+=(float other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) = *reinterpret_cast<const glm::vec2*>(this) + other;
            return *this;
        }

        inline GeoVector2F operator-=(float other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) = *reinterpret_cast<const glm::vec2*>(this) - other;
            return *this;
        }

        inline GeoVector2F operator*=(float other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) = *reinterpret_cast<const glm::vec2*>(this) * other;
            return *this;
        }

        inline GeoVector2F operator/=(float other) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) = *reinterpret_cast<const glm::vec2*>(this) / other;
            return *this;
        }

        void rotateToAngleAroundPoint(float angleRotationValue, GeoVector2F point) noexcept
        {
            *reinterpret_cast<glm::vec2*>(this) =
                glm::rotate((*reinterpret_cast<glm::vec2*>(this) = *reinterpret_cast<const glm::vec2*>(this) -
                                                                   *reinterpret_cast<const glm::vec2*>(&point)),
                            glm::radians(angleRotationValue)) +
                *reinterpret_cast<const glm::vec2*>(&point);
        }

        bool epsilonEquals(GeoVector2F other, GeoVector2F epsilonValue) const noexcept
        {
            return glm::all(glm::equal(*reinterpret_cast<const glm::vec2*>(this),
                                       *reinterpret_cast<const glm::vec2*>(&other),
                                       *reinterpret_cast<const glm::vec2*>(&epsilonValue)));
        }

        static GeoVector2F zero() noexcept
        {
            return GeoVector2F::uniform(0);
        }

        static GeoVector2F one() noexcept
        {
            return GeoVector2F::uniform(1);
        }

        static GeoVector2F uniform(float value) noexcept
        {
            return GeoVector2F(value, value);
        }
    };

    inline GeoVector2F operator*(float lhs, GeoVector2F rhs) noexcept
    {
        return rhs * lhs;
    }

}

#endif //! NOVELRT_MATHS_GEOVECTOR2_H
