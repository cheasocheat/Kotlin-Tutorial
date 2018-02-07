package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 16:02
 */

fun foo(k : Int){
    require(k > 10, { "k should be greater than 10" })
}

fun main(args: Array<String>) {
    foo(9)
}