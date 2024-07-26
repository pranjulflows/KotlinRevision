package org.macamps.queue

interface Queue<T:Any> {
    fun dequeue():T?
    fun enqueue(element: T): Boolean
    fun peek():T?

    val count:Int
    val isEmpty:Boolean
}