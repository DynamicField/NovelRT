package com.github.novelrt.timing

import com.github.novelrt.interop.NovelRT

@JvmInline
value class Timestamp(val ticks: ULong) {
    operator fun plus(other: Timestamp): Timestamp = Timestamp(ticks + other.ticks)
    operator fun minus(other: Timestamp): Timestamp = Timestamp(ticks - other.ticks)
    operator fun div(other: Timestamp): Timestamp = Timestamp(ticks / other.ticks)
    operator fun times(other: Timestamp): Timestamp = Timestamp(ticks * other.ticks)

    operator fun compareTo(other: Timestamp): Int = ticks.compareTo(other.ticks)

    fun getSecondsDouble() = NovelRT.Nrt_Timestamp_getSecondsDouble(ticks.toLong())
    fun getSecondsFloat() = NovelRT.Nrt_Timestamp_getSecondsFloat(ticks.toLong())

    internal fun toNative(): Long = ticks.toLong()

    companion object {
        val ZERO = Timestamp(0u)

        fun fromSeconds(seconds: Double): Timestamp {
            return Timestamp(NovelRT.Nrt_Timestamp_fromSeconds(seconds).toULong())
        }

        internal fun NrtTimestamp.toTimestamp(): Timestamp {
            return Timestamp(this.toULong())
        }
    }
}
