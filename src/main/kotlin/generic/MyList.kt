package generic

interface MyList<T> {
    fun get(index: Int): T
    fun add(t: T)
    fun remove(t: T)
    fun removeAt(index: Int)
    fun size(): Int
}