package org.macamps

import java.util.LinkedList

fun main() {
    for (number in 1..100) {
        val result = when {
            (number % 15 == 0) -> "FizzBuzz"
            (number % 3 == 0) -> "Fizz"
            (number % 5 == 0) -> "Buzz"
            else -> "$number"
        }
        println(result)
    }
}
