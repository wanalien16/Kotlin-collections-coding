package org.example
import kotlin.collections.*
fun main() {
    var employees = mutableListOf("goutham", "umesh", "anil")

    employees.replaceAll { if (it == "ani") "sai" else it }
   employees.forEach { employee-> println(employee) }
}
