package generic

import java.lang.IndexOutOfBoundsException

class MyArrayList<T> : MyList<T> {
    var array = arrayOfNulls<Any>(10)
    var size = 0

    companion object {
        fun <T> myListOf(vararg elements: T): MyArrayList<T> {
            val list = MyArrayList<T>()
            for (i in elements) {
                list.add(i)
            }
            return list
        }
    }

    override fun get(index: Int): T {
        if (index in 0 until size) {
            return array[index] as T
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(t: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = t
        size++
    }

    override fun remove(t: T) {
        for ((index, i) in array.withIndex()) {
            if (i == t) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
            return
        }
        throw IndexOutOfBoundsException()
    }

    override fun size() = size
}