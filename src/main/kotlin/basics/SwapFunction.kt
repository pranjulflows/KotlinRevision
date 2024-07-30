package org.macamps.basics

fun main() {
    var one = 20
    var two = 30

    val temp: Int = one
    one = two
    two = temp

    print("Swapped $one $two ")


}