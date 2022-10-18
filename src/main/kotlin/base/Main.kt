package base

fun main() {
    val dog: Dog = Dog()
    dog.name = "антон"
    dog.weight = -75.21
    dog.age = -20
    println("Кличка: ${dog.name}, вес: ${dog.weight}, возраст: ${dog.age}")
}