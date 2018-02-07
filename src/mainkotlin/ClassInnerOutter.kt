package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 13:59
 */
class Outer {
    val foo = "in Outer"
    inner class Inner{
        fun getFoo() = foo + "+ Inner "
        fun callMe() = "Called inside Inner"
    }
}

fun main(args: Array<String>) {
    println(Outer().foo)
    println(Outer().Inner().getFoo())
    println(Outer().Inner().callMe())
}