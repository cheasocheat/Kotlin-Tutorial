package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 12:03
 */

//https://www.callicoder.com/kotlin-functions/

val a = doubleArrayOf(1.5, 2.6, 5.4)


fun main(args: Array<String>) {
    val value = sumOfNumbers(*a)  // Result = 9.5
    println(value)
}