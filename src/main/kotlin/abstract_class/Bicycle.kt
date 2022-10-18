package abstract_class

class Bicycle: Transport("Велосипед") {
    override fun drive() {
        println("Кручу педали")
    }
}