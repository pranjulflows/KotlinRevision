package org.macamps.sorting

fun main() {
    val unsorted = mutableListOf(9, 3, 4, 134, 45, 1, 4)

    for (i in 0 until unsorted.size) {
        for (j in 1 until unsorted.size - i) {
            if (unsorted[j - 1] > unsorted[j]) {
                val temp: Int = unsorted[j]
                unsorted[j] = unsorted[j - 1]
                unsorted[j - 1] = temp
            }
        }
    }

    print(unsorted)

}