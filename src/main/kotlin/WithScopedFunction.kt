package org.example


class Student{
    var name: String = "Anil"
    var phone_num: String = "999999999"
    var address: String? = null
    fun displayInfo() {
        print("name = $name, \n contact is $phone_num, Address is $address")
    }
}
fun main(){
    val student: Student? = null
    with(student){
        this?.address = "abcdefgh"
        this?.phone_num= "852254"
        this?.name="umesh"
        this?.displayInfo()
    }

//    performRunOperation()


}
//fun performRunOperation() {
//    val student2: Student? = null
//    student2?.run {
//        name = "asdf"
//        phone_num = "1234"
//        address = "wasd"
//        displayInfo()
//    }
//}
