package main

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 13:17
 */
open class Base {
    open fun f() {}
    open fun b() {}
}

abstract class Derived : Base() {
    override abstract fun f()
    override abstract fun b()
}

class SecLevel : Derived(){
    override fun b() {

    }

    override fun f() {

    }
}



abstract class BB{
    abstract fun printMe()
}

class CC : BB() {
    override fun printMe() {

    }
}