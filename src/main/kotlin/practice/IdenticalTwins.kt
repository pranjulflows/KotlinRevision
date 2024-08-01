package org.macamps.practice

fun main() {

    println("Found Identical Twins: ${getIdenticalTwinsCount(arrayOf(1, 1, 1, 1))}")
    println("Found Identical Twins: ${getIdenticalTwinsCountWithHashing(arrayOf(1, 1, 1, 1))}")
}
// with hashmaps

fun getIdenticalTwinsCountWithHashing(arr: Array<Int>): Int {
    var twins = 0
    val feq = HashMap<Int, Int>()
    for (i in arr.indices) {
        var count = feq[arr[i]]

        if (count == null) {
            feq[arr[i]] = 1
        } else feq[arr[i]] = ++count
    }

    // count the twins
    for (value in feq.entries) {
        twins += (feq[value.key]!! * (feq[value.key]!! - 1)) / 2
    }

    return twins
}

// with array loops
fun getIdenticalTwinsCount(arr: Array<Int>): Int {
    var twins = 0

    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                twins++
            }
        }
    }

    return twins
}