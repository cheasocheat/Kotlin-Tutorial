package util

/**
 *    Developer : cheasocheat
 *    Created on 1/30/18 09:50
 */

class Student {
    //Property
    private var id: Int = 0
    private var name: String = ""
    private var age: Int = 0

    //Primary Constructor


    //Function
    fun printValue() {
        println("Super Hello")
    }
}

//Class with primary constructor
class Employee(var id : Int ,var name : String){
    val empName : String
    private var age : Int = 0

    //Initializer Block
    init {
        empName = name.capitalize()
    }

    fun printValue(name : String){
        println("Super Hello : $name")
    }
}

fun main(args: Array<String>) {
    var obj = Student()
    obj.printValue()

    var obj2 = Employee(1, "Socheat")
    obj2.printValue(obj2.name)
}