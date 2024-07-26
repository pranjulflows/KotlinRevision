package org.macamps.basics

fun main(){
    print(factorial(10))

}
fun factorial(i: Int): Long {
    if (i == 0) return 1
    return i * factorial(i - 1)
}