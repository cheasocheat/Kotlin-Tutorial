package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 01:07
 */

//With the help of these functions (let, run, with, apply and also),
// we can operate on objects within a certain context.

//https://medium.com/@elye.project/mastering-kotlin-standard-functions-run-with-let-also-and-apply-9cd334b0ef84
fun test() {
    var mood = "I am sad"

    run {
        val mood = "I am happy"
        println(mood) // I am happy
    }
    println(mood)  // I am sad
}

fun main(args: Array<String>) {
    test()
}