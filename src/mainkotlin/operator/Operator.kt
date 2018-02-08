package mainkotlin.operator

/**
 *    Developer : cheasocheat
 *    Created on 2/8/18 09:43
 */

/**
 * INVOKE
 */




fun main(args: Array<String>) {
    val numbers = intArrayOf(1, 4, 3, 43, -5)
    numbers.set(0,22)

    if (22 in numbers) {
        println("Numbers array contains 422")
    }
}