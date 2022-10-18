package data_class

//data class Address(val city: String, val street: String, val num: Int)

class Address(private val city: String, private val street: String, private val num: Int) {
    fun copy(city: String = this.city, street: String = this.street, num: Int = this.num): Address {
        return Address(city, street, num)
    }

    operator fun component1() = city

    operator fun component2() = street

    operator fun component3() = num

    override fun toString(): String {
        return "Address(city=$city, street=$street, num=$num)"
    }

    override fun hashCode(): Int {
        return this.city.hashCode() + this.street.hashCode() + this.num
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (num != other.num) return false

        return true
    }
}