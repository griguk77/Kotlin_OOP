package companion_object

class MyRandom {
    companion object {
        private const val MONDAY = "Monday"
        private const val TUESDAY = "Tuesday"
        private const val WEDNESDAY = "Wednesday"
        private const val THURSDAY = "Thursday"
        private const val FRIDAY = "Friday"
        private const val SATURDAY = "Saturday"
        private const val SUNDAY = "Sunday"
        fun randRange(a: Int, b: Int) = (Math.random() * (b - a + 1) + a).toInt()
        fun randBool() = randRange(0, 1) == 1
        fun randDay(): String {
            return when (randRange(1, 7)) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                7 -> SUNDAY
                else -> "Clown"
            }
        }
    }
}