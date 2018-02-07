package mainkotlin.enum

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 14:45
 */
enum class Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum class RecStatus(val code : String, val desc : String){
    ACTIV("ACT", "Active"),
    INACT("INACT","In Active")
}

fun main(args: Array<String>) {
    println(RecStatus.ACTIV.desc)
}

