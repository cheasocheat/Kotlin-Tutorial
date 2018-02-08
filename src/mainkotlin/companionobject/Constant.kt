package mainkotlin.companionobject

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 09:20
 */

class Constant{
    companion object {
        @JvmField val LIMIT = 10
        @JvmField val OFFSET = 10
    }
}

fun main(args: Array<String>) {
    println(Constant.LIMIT)
    println(Constant.OFFSET)

}