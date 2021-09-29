package com.lanars.composedateinput

data class FieldsData(
    val day: Array<Int?>,
    val month: Array<Int?>,
    val year: Array<Int?>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FieldsData

        if (!day.contentEquals(other.day)) return false
        if (!month.contentEquals(other.month)) return false
        if (!year.contentEquals(other.year)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = day.contentHashCode()
        result = 31 * result + month.contentHashCode()
        result = 31 * result + year.contentHashCode()
        return result
    }
}
