package org.macamps

fun main() {
    val noOfRows = 5
    for (rows in 1..noOfRows) {

        for (space in 1..noOfRows - rows) print("  ")

        for (star in 1..<2 * rows) print("$star ")

        println()
    }


}