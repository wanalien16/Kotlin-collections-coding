package org.example

fun main(){
  val students = mutableListOf("anil", "goutham", "umesh")
    display(students)
    students.add("anirudh")
    display(students)
}
fun display(students: MutableList<String>): Unit{
    for (student in students)
        println(student)
}
