package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 09:40
 */


/**

Kotlin Function
-lambdas
-inline

 **/


fun main(args: Array<String>) {
    /**
     * Lambdas Example 1
     */
    val lambdas: (String, Int) -> Unit = { user: String, score: Int ->
        println("Hello $user! you get $score pt")
    }
    val str: String = "Reahoo"
    lambdas(str, 2)

    /**
     * Lambdas Example 2
     */
    println("======================")
    val names = arrayOf("joe", "Mzannee", "molly", "dolly")
    val seleted = names.filter { name -> name.startsWith("m", ignoreCase = true) }
            .sortedBy { name -> name.length }
    for (item in seleted) {
        println(item)
    }

    /**
     * Lambdas Example 3
     */
    println("======================")
    val max = { a: Int, b: Int ->
        if (a > b) a else b
    }
    println("Max is " + max(3, 4))


    /**
     * Lambdas Example 4
     */
    println("======================")
    val doStuff = lambda@ { stopEarly: Boolean ->
        println("line 1")
        if (stopEarly) return@lambda
        println("line 2")
    }
    doStuff(true)
    doStuff(false)



    /**
     * Lambdas Example 4 : Refer to 3 but no label
     */
    println("======================")
    val printMe  = fun(stop : Boolean){
        println("line 1")
        if(stop) return
        println("line 2")
    }
    printMe(true)
    printMe(false)

    /**
     * Lambdas Example 5
     */
    println("======================")
    val say : () -> Unit = {
        println("Don't print me.")
    }
    say()
}
