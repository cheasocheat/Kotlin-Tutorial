package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 11:43
 */

fun displayGreeting(message : String = "Welcome to the hell", name : String = "Reahoo"){
    println("Hello $name, $message")
}

fun main(args: Array<String>) {
    displayGreeting()
}