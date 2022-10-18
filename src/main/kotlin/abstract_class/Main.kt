package abstract_class

fun main() {
    val auto: Transport = Auto("Автомобиль")
    if ((auto !is Auto) || auto.startEngine()){
        auto.drive()
    }
}