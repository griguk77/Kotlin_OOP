package methods

import java.util.Calendar

class Worker(val name: String, var position: String, var year: Int) {
    fun work() {
        println("Работаю...")
    }
    val seniority: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - year
}