package org.example

fun main(){
    val list = mutableListOf("anil", "umesh", "goutham", "prudhvi")
    list.sorted()
    println(list)
    list.sortedBy { it.length }
    println(list)
    println(list.isEmpty())
    println(list.isNotEmpty())
    println(list.random())
    println(list.elementAt(2))
    println(list.first { it.startsWith("p") })
}