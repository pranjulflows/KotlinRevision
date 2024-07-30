package org.macamps.linkedList

class LinkedList<T : Any> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size: Int = 0

    private fun isEmpty(): Boolean = size == 0

    override fun toString(): String {
        return if (isEmpty()) return "Empty List" else head
            .toString()

    }

    // add the value at the head of the list or at the very first node


    fun push(value: T): LinkedList<T> = apply {
        head = Node(value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }

    // add value to list at the end of list
    fun append(value: T): LinkedList<T> = apply {
        if (isEmpty()) {
            push(value)
            return this
        }
        val newNode = Node(value)
        tail!!.next = newNode
        tail = newNode
        size++
    }

    // to find a value of specific node or index
    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++

        }
        return currentNode
    }


    // insert a value at specific node or index
    fun insert(value: T, afterNode: Node<T>): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        val newNode = Node(value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }

}