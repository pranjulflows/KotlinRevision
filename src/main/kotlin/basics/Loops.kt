package org.macamps.basics

//  Loops Practice
fun main() {
    var counted =0
    val cakes = listOf("vanilla","Cheese Cake","chocolate Cake")

    while(counted < cakes.count()){
        println("cake ${cakes[counted]} is counted")
        counted++
    }

    for (cake in cakes){
        print("$cake ")
    }

    for (numbers in 10 downTo  0 step 5) {
        println(numbers)
    }

}