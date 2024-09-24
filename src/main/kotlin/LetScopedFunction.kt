package org.example


class Person() {
    var name: String = "Anil"
    var phone_num: String = "999999999"
    var address: String? = null
    fun displayInfo() {
        print("name = $name, \n contact is $phone_num, Address is $address")
    }
}
fun main(){
    val person = Person().let{
return@let "the name of the person is ${it.name}"
    }
    println(person)

    val phoneNumber = Person().let {
        "the phone number of the person is ${it.phone_num}"
    }
    println(phoneNumber)

    val address = Person().address?.let {
        return@let "address is ${it}"
    }
    println(address)
}
