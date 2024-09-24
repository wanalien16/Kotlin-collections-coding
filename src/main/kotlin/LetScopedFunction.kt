package org.example


class Person() {
    var name: String = "Anil"
    var phone_num: String = "999999999"
    var address: String = "xyz, ngngngnngngng"
    fun displayInfo() {
        print("name = $name, \n contact is $phone_num, Address is $address")
    }
}
fun main(){
    val person = Person().let{
return@let "the name of the person is ${it.name}"
    }
    println(person)
}
