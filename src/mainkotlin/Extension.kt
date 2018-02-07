package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 15:54
 */

fun String.funny() : String{
    return "Hello " + this + ". You are Big olo!"
}

fun main(args: Array<String>) {
    var str = "Reahoo"
    println(str.funny())
}