package mainkotlin.collection

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 09:26
 */


val items = listOf(1,2,3,4,5,6)
val rwList = mutableListOf<Int>(1,2,3,4,5,6)

fun main(args: Array<String>) {
    var element = items.get(1)
    println(element)

    println()
    println()
    //mutable
//    rwList.add(3, 55)
    val size = rwList.size
    for (item in rwList){
        println(item)
    }

    println()
    println()
    for(i in 0..rwList.size-1){
        println(rwList.get(i))
    }
}