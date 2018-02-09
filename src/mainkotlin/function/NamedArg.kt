package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 11:49
 */

fun test(message : String = "Welcome to the hell", name : String = "Reahoo"){
    println("Hello $name, $message")
}

fun main(args: Array<String>) {
    test(name = "Socheat")
}