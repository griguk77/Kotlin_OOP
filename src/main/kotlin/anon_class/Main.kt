package anon_class

fun main() {
    val sportsman = Sportsman()
    sportsman.call(object : WaterBoy {
        override fun bringWater() {
            println("Уже несу")
        }
    })
    sportsman.call { println("Уже несу") }
}