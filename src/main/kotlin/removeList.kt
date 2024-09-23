package org.example

fun main(){
    val students = mutableListOf("anil", "sai", "damayapally")

    students.removeAt(0)
    println(students)
    students.remove("sai")
    println(students)
}