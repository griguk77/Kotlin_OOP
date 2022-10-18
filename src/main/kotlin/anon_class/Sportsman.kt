package anon_class

class Sportsman {
    fun call(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }
    inline fun call(water: ()->Unit) {
        water()
    }
}