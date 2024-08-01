package org.macamps.practice

fun main() {
    val arr = arrayOf(2, 2, 3, 4, 5, 9)
    var k = 22
    val n = arr.size
    k = k % n

    //Rotation of array
    reverse(arr, 0, n - 1)
    reverse(arr, 0, k - 1)
    reverse(arr, k, n - 1)

    for (element in arr) {
        print(" $element, ")
    }

}

fun reverse(arr: Array<Int>, start: Int, end: Int) {
    var start = start
    var end = end

    while (start <= end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
}