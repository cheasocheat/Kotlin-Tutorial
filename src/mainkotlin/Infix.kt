package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 1/30/18 09:39
 */


/**
 * Custom Infix Function
 */
class Structure(){
    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}


fun main(args: Array<String>) {

    /**
     * Infix
     */
    val a = true
    val b = false

    println("Num 2 = " + a.or(b))

    val p = Structure()
    p createPyramid 5       // p.createPyramid(4)
}

