package org.example

fun main(){
    val list = listOf("anil", "goutham","prudhvi")
    val mutableList : MutableList<String> = list.toMutableList()
    mutableList.add("prudhvi")
    println(mutableList)
}