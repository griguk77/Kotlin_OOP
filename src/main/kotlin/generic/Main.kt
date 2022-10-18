package generic

fun main() {
    val list = MyArrayList.myListOf(1, 4, 5, "hsfd", "53", "", 8)
    for (i in 0..100) {
        list.add("$i")
    }
    for (i in 0..90) {
        list.removeAt(7)
    }
    list.remove("97")
    println(list.get(3))
    println(list.size())
    for (i in 0 until  list.size()){
        println(list.get(i))
    }
}