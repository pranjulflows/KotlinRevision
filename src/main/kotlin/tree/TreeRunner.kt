package org.macamps.tree

fun makeBeverageTree(): TreeNode<String> {
    val tree = TreeNode("Beverages")

    val hot = TreeNode("Hot")
    val cold = TreeNode("Cold")

    val tea = TreeNode("Tea")
    val coffee = TreeNode("Coffee")
    val chocolate = TreeNode("Cocoa")

    val blackTea = TreeNode("Black Tea")
    val greenTea = TreeNode("Green Tea")
    val chaiTea = TreeNode("chai")

    val soda = TreeNode("soda")
    val milk = TreeNode("milk")

    val gingerAle = TreeNode("ginger ale")
    val bitterLemon = TreeNode("Bitter Lemon")


    tree.add(hot)
    tree.add(cold)

    hot.add(tea)
    hot.add(coffee)
    hot.add(chocolate)

    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)

    cold.add(soda)
    cold.add(milk)

    soda.add(gingerAle)
    soda.add(bitterLemon)

    return tree
}

fun main() {

    val tree = makeBeverageTree()
    tree.search("chai ")
    tree.printEachLevel()
//    tree.forEachDepthFirst { println(it.value) }

//    tree.forEachDepthFirst { println(it.value) }


}