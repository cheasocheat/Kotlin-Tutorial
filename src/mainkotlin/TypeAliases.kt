package mainkotlin

import util.str


/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 10:10
 */

/**

A type alias declaration introduces a named alias of an existing type into your program.
Type alias declarations are declared using the keyword typealias and have the following form:

typealias name = existing type

 */

data class User(val name: String)

typealias Reahoo = String
typealias Sup = User
typealias IntToStringConverter = (Int) -> String
typealias Predicate<T> = (T) -> Boolean
typealias MyHandler = (Int, String, Any) -> Unit
typealias StringListAppender = (String, MutableList<String>) -> Unit

fun main(args: Array<String>) {
    val x: Reahoo = "Type aliases Example"
    println(x)

    printMe("typealias Sup = User")
    val obj: Sup = Sup("Reahoo")
    println(obj.name)

    printMe("typealias Predicate<T> = (T) -> Boolean")
    val p: Predicate<Int> = {
        it > 0
    }
    println(listOf(1, -2).filter(p))
    println(listOf(1, -6, 7).filter { a -> a > 0 })

    printMe("typealias IntToStringConverter = (Int) -> String")
    val showUnluckyNubmer: IntToStringConverter = {
        "Hey [$it]- Unlucky!"
    }
    val res = showUnluckyNubmer(7)
    println(res)

    printMe("typealias StringListAppender = (String, MutableList<String>) -> Unit")
    val dataStr: (String, MutableList<String>) -> Unit = {
        s: String, list -> list.add(s)
    }
    val listStr: MutableList<String> = arrayListOf("Visa","Kanha","Dolar")
    var arr = dataStr("Reahoo", listStr)
    print(arr)
}

fun printMe(str: String) {
    println()
    println("=====================================================")
    println("Example of : $str")
}