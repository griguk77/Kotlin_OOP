package heirdom

open class Worker(val name: String, var age: Int) {
    open fun work() {
        println("Работаю...")
    }
}