package util

/**
 *    Developer : cheasocheat
 *    Created on 1/29/18 14:34
 */
var language : String = "Cambodian"
val CONST : String = "API"
val range: Byte = 127

val a = 5
val b = 6

val str = "DD"
var str2 = "EE"

fun main(args : Array<String>) {

    println("${range}")
    println("Hello, world! ${language} ${CONST}")


    //Kotlin operator
    print(a.plus(b))

    println(str2.plus(str))

    println(str.plus(b))

    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var sum = Point()
    sum = p1 + p2

    println("sum = (${sum.x}, ${sum.y})")
    println("sum = $sum")

}


class Point(val x: Int = 0, val y: Int = 10) {

    // overloading plus function
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }
}