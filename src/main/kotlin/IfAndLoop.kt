package org.macamps

fun main(){
    val words = listOf("dinosaur", "limousine", "magazine", "language")


    for(word in words){
        if(word.lowercase().startsWith("l")){
            println(word)
        }
    }


}