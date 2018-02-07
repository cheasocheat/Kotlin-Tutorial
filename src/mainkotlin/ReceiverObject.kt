package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 13:21
 */

class DummyObject {
    fun foo() { println("foo") }
    fun bar() { println("bar") }
}

fun main(args: Array<String>) {
    val f1 : DummyObject.() -> Unit = {
        foo()
        bar()
        this.foo()
    }

    // we can call lambda in a classic way
    f1(DummyObject())

    println()

    // or using more idiomatic syntax
    val dummy = DummyObject()
    dummy.f1()

    println()
    val x: ()->Unit = { dummy.foo() }
    x()
    val y = { dummy.bar() }
    y()

    println()
    val x2: ()->Unit = dummy::foo
    x2() // calls foo on dummy

    val y2 = dummy::bar
    y2() // calls bar on dummy
}