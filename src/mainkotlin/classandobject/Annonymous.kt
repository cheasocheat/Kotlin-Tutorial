package mainkotlin.classandobject

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 15:11
 */

interface BaseHuman{
    fun smile()
}

open class Person{
    open fun cry() {
        println("Person is crying")
    }

    companion object{
        @JvmStatic
        fun getInstance() : Person = Person()

        @JvmStatic
        fun getTest() = println("Person can test sth")
    }
}

fun main(args: Array<String>) {
    var obj : BaseHuman = object : BaseHuman {
        override fun smile() {
            println("Hehe Developer Smile")
        }
    }

    obj.smile()


    var signer : Person = object : Person(){
        override fun cry() {
            println("Singer don't cry")
        }
    }
    signer.cry()

    println()

    Person.getTest() // really similar static

    Person.getInstance().cry()
}