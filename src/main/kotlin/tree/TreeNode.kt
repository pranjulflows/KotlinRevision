package org.macamps.tree

import org.macamps.queue.QueueImpl

typealias Visitor<T> = (TreeNode<T>) -> Unit // to make it more readable create a TypeAlias for the high Order Function

class TreeNode<T : Any>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()
    fun add(child: TreeNode<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)
        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }

    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)
        val queue = QueueImpl<TreeNode<T>>()

        children.forEach { queue.enqueue(it) }

        var node = queue.dequeue()

        while (node != null) {
            visit(node)

            node.children.forEach { queue.enqueue(it) }

            node = queue.dequeue()
        }

    }

    fun search(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null

        forEachDepthFirst {

            if (it.value == value) {
                result = it
                println("Found value ${it.value}")
            }

        }

        return result

    }

    fun printEachLevel() {
        val queue = QueueImpl<TreeNode<T>>()
        queue.enqueue(this)
        var nodeLeftInCurrentLevel = 0
        while (queue.isEmpty.not()) {
            nodeLeftInCurrentLevel = queue.count

            while (nodeLeftInCurrentLevel > 0) {
                val node = queue.dequeue()
                if (node != null) {
                    println("${node.value}")

                    node.children.forEach { queue.enqueue(it) }
                    nodeLeftInCurrentLevel--

                } else break
            }
            println()
        }
    }
}