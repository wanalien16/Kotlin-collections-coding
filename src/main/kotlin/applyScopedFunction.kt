package org.example

class Professor{
    var name: String = "Anil"
    var phone_num: String = "999999999"
    var address: String? = null
    fun displayInfo() {
        print("name = $name, \n contact is $phone_num, Address is $address")
    }
}
//the difference between run and apply is apply return a object and run can return any variable inside object.
fun main(){
    val professor =  Professor().apply{
        name = "nagu"
        phone_num = "4545454545"
        address = "djdjdjjdjdd"
    }
    println(professor.name)
}

