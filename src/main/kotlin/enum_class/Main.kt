package enum_class

import enum_class.Month.*
import enum_class.Season.*

fun main() {
    val month = FEBRUARY
    val season = when(month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println(season)
    println(season.tempAverage)
}