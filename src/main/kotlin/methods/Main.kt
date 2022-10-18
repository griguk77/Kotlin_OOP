package methods

fun main() {
    val worker = Worker("Алексей", "Сеньор", 2018)
    worker.work()
    worker.printInfo()
}

fun Worker.printInfo() {
    println("Имя: $name, должность: $position, год устройства: $year, стаж: $seniority")
}