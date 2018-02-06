package main

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 10:45
 */

open class SuBase {
    var a : Int
        get() = a
        set(value) {a = value}

    internal var b : Int
        get() = b
        set(value) {b = value}


    protected open val c = 4
}

class DerivedFromBase : SuBase(){
    override var c: Int
        get() = super.c
        set(value) {c = value}
}

fun main(args: Array<String>) {

    var programmer = Programmer(1, "Reahoo", 23, 34.0)
    programmer.printMe()


    var base = SuBase()
    println(base.a)
    println(base.b)

}