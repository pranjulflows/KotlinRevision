package org.macamps.basics

fun main() {
    println("With SWAP:${fabWithSwap(9)}")
    println("With Recursion: ${fabWithRecursion(9)}")
}

// With Recursion
fun fabWithRecursion(max: Int): Int {
    if (max <= 1) return max
    return fabWithRecursion(max - 1) + fabWithRecursion(max - 2)
}

// With swap function
fun fabWithSwap(max: Int): Int {
    var a = 0
    var b = 1
    var temp: Int
    if (max == 0) return a
    for (i in 2..max) {
        temp = a + b
        a = b
        b = temp
    }
    return b
}


