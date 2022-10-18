package data_class

fun main() {
    val address1 = Address("Moscow", "Arbat", 31)
    val address2 = address1.copy(num = 76)
    val (city, name, num) = address1
    println(city)
    println(name)
    println(num)
    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)
    println(address1 === address2)
}