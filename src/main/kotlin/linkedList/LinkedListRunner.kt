package org.macamps.linkedList


fun main() {

    val list = Node(1, Node(2, Node(3, Node(4, Node(5)))))
   println(list)
   list.printInReverse()

    val linked = LinkedList<Int>()
    linked.append(1).append(2).append(3).append(4)

    linked.push(1).push(2).push(3).push(4)
    println(linked)

    insertExample()
}

fun insertExample(){
    val list  = LinkedList<Int>()

    list.push(3).push(2).push(1)
    println("Before insertion: $list")
    var  middleNode = list.nodeAt(1)!!
    for(i in 1.. 3){
        middleNode = list.insert(0, middleNode)
    }
    println("After insertion: $list")

}