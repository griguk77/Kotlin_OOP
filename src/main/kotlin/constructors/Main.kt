package constructors

fun main() {
    val book = Book("Game of Thrones")
    book.year = 52
    book.price = 325
    println("Имя: ${book.name}, дата выхода: ${book.year}, цена: ${book.price}")
}