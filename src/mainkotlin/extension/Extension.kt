package mainkotlin.extension

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 15:54
 */

fun String.funny() : String{
    return "Hello " + this + ". You are Big olo!"
}

fun String.isEmptyString() : Boolean{
    return this is String && this.isEmpty()
}

fun main(args: Array<String>) {
    var str = "Reahoo"
    println(str.funny())
}