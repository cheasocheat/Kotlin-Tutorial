package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 16:02
 */

//They are also called package level functions because they are a member of the package in which they are defined.

fun foo(k : Int){
    require(k > 10, { "k should be greater than 10" })
}


fun main(args: Array<String>) {
    foo(9)
}