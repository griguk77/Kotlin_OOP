package heirdom

class Programmer(name: String, age: Int, private val language: String) : Worker(name, age) {
    override fun work() {
        println("Пишу код на $language")
    }
}