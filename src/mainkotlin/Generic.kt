package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 14:49
 */

class Box<T>(t:T){
    var value = t

    fun printMe(){
        println("Hello Value $value")
    }
}

fun main(args: Array<String>) {
    var box = Box<String>("Box")
    box.printMe()
}
