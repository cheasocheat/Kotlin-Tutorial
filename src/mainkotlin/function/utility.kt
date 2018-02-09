package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 14:15
 */

//https://kotlin.guide/kotlin-vs-java

fun main(args: Array<String>) {
    repeat(10,{
        when(it){
            6 -> println("$it Special case")
            else -> println("$it No special case")
        }
    })
}