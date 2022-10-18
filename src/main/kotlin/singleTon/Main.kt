package singleTon

fun main() {
    val db = DataBase
    db.insert(1)
    db.insert(2)
    val test = Test()
    test.insertTest(3)
    test.insertTest(4)
    for (i in db.data) {
        println(i)
    }
}