package abstract_class

class Auto(override var name: String = "Машина"): Transport(name) {
    override fun drive() {
        println("Жму на газ")
    }
    fun startEngine(): Boolean{
        println("Запускаю двигатель")
        return true
    }
}