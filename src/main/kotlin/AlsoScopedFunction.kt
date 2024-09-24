package org.example

class Friends{
    var name: String = "Anil"
    var phone_num: String = "999999999"
    var address: String? = null
    fun displayInfo() {
        print("name = $name, \n contact is $phone_num, Address is $address")
    }
}


fun main(){
    val friend = Friends().also { friend->
        friend.name = "ani"

    }
    println(friend.name)
}