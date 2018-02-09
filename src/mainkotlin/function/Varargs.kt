package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 11:51
 */


// vararg parameter of type T is internally represented as an array of type T (Array<T>) inside the function body.

fun sumOfNumbers(vararg numbers: Double): Double {
    var sum = 0.0
    for(number in numbers) {
        sum += number
    }
    return sum
}

fun sumOfNumbers(vararg numbers: Double, initialSum: Double): Double {
    var sum = initialSum
    for(number in numbers) {
        sum += number
    }
    return sum
}

fun main(args: Array<String>) {
    println(sumOfNumbers(1.5)) // Result = 1.5
    println(sumOfNumbers(1.5, 2.0))  // Result = 3.5
    println(sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2))  // Result = 23.0

    println()
    println(sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2, initialSum = 100.0))  // Result = 23.0

}