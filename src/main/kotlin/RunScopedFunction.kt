package org.example

class Employee{
    var name: String = "Anil"
    var phone_num: String = "999999999"
    var address: String? = null
    fun displayInfo() {
        print("name = $name, \n contact is $phone_num, Address is $address")
    }
}
//Difference between run and let is run uses this for context whereas let uses it for context which can be renamed in lambda
//for readability but this in run scope function can not be renamed to any word in lambda

fun main(){
    Employee().run {
        name = "goutham"
        phone_num = "988484848484848"
        address= "ededededededede"
        return@run "the details of Employee: ${displayInfo()}"
    }

    Employee().run {
         "${displayInfo()}"
    }
}