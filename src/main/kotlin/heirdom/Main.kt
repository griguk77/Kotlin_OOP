package heirdom

fun main() {
    val workers: ArrayList<Worker> = arrayListOf()
    workers.add(Worker("Василий", 31))
    workers.add(Programmer("Евгений", 23, "Kotlin"))
    workers.add(Programmer("Александр", 29, "Java"))
    workers.add(Worker("Георгий", 21))
    workers.add(Worker("Иннокентий", 37))
    workers.add(Programmer("Илья", 43, "C++"))
    for (i in workers) {
        i.work()
    }
}