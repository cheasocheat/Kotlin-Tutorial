package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 09:49
 */

open class Person2(age: Int, name : String){
    init {
        println("My name is $name.")
        println("My age is $age.")
    }
    open fun printJob(){
        println("Nothing gonna print out")
    }
}

class MathTeacher(age: Int, name: String) : Person2(age, name){
    override fun printJob() {
        println("My Job is Math Teacher")
    }
}

class Footballer(age: Int, name: String, birthDate : String) : Person2(age, name){
    var mAge : Int
    var mName : String
    var mBDate : String
    init {
        mAge = age
        mName = name
        mBDate = birthDate
    }


    override fun printJob() {
        println("My Job is mainkotlin.Footballer")
        println("I was born in $mBDate")
    }
}

fun main(args : Array<String>){
    var mathObj = MathTeacher(23, "Ros Chantha")
    mathObj.printJob()

    val footbalObj = Footballer(12, "Robino", "12/12/2102")
    footbalObj.printJob()
}