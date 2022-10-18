package singleTon

object DataBase {
    var name: String = "main.db"
    var version: Int = 1
    val data = mutableListOf<Int>()
    fun insert(x: Int) {
        data.add(x)
    }
}