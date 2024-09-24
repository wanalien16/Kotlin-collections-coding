package org.example

class Employee{
    var name: String = "Anil"
    var phone_num: String = "999999999"
    var address: String? = null
    fun displayInfo() {
        print("name = $name, \n contact is $phone_num, Address is $address")
    }
}

fun main(){
    Employee().run {
        name = "goutham"
        phone_num = "988484848484848"
        address= "ededededededede"
        return@run "the details of Employee: ${displayInfo()}"
    }
}