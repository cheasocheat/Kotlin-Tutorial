package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 10:17
 */


typealias Counter = ()->Int

fun counter(initValue: Int): Counter {
    var n = initValue
    return { n++ }
}


fun main(args: Array<String>) {
    val c1 = counter(100)

    println(c1()) // 100
    println(c1()) // 101
    println(c1()) // 102

    var sum = 0
    (1..2).forEach {
        sum += it
    }
    print(sum)
}


