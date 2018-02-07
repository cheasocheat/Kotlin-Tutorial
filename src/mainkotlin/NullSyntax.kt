package mainkotlin

import mainkotlin.extension.isEmptyString

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 14:12
 */


fun isString(any : Any) : Boolean{
    return if(any is String) true else false
}

fun printStringLeng(st : String){
    if (st is String){
        println(st.length)
    }
}

fun main(args: Array<String>) {

    var str: String? = null

    println(str)
    println()

    val str2 = 3
    println(isString(str2))

    println()
    val str3 = "e"
    printStringLeng(str3)

    println()
    //From Extension
    val data = str3.isEmptyString()
    when (data){
        true -> println("IS EMPTY")
        false -> println("NOT EMPTY")
        else -> println("I DON'T KNOW")
    }
}