package main

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 16:08
 */

interface IBase{
    fun printMe() //abstract
}

class Dev(val _x : Int) : IBase{
    override fun printMe() {
        println("Value = $_x")
    }
}

class DevDerived(b : IBase) : IBase by b

/**
 * mean
 */


fun main(args: Array<String>) {
    var obj = Dev(1)
    obj.printMe()

    val obj2 = Dev(10)
    DevDerived(obj2).printMe()
}

