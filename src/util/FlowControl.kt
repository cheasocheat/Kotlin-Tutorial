package util

/**
 *    Developer : cheasocheat
 *    Created on 1/30/18 09:20
 */

fun main(args: Array<String>) {

    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }
    var number = Math.sqrt(5.5)
    print("Result = $number")
}