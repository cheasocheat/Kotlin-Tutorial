package mainkotlin.controlflow

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 14:32
 */

fun isMinOrMax(x : Int) : String{
    val value = when(x){
        Int.MIN_VALUE -> "MIN"
        Int.MAX_VALUE -> "MAX"
        else -> "DK"
    }
    return value
}

fun main(args: Array<String>) {
    println(isMinOrMax(0))
}