package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/8/18 13:32
 */

/**
 *  In This tutorial you will learn
 *  - Inline
 *  - Not Inline
 *  - Crossinline
 **/

/** Inline */
/*
    - To pass lambdas function to function param , we need to invoke an instance of function so we use inline to prevent invoke instance
    - https://stackoverflow.com/questions/44471284/when-to-use-an-inline-function-in-kotlin/44471411#44471411
    - https://android.jlelse.eu/inline-noinline-crossinline-what-do-they-mean-b13f48e113c2
    - With inline function, you will not be able to access private members/methods of your enclosing class.
      You will need to make those members/methods internal and then annotate them with @PublishedApi
    - When using inline, you will be able to return from the lambda which in return from the calling function.  Called Non-Local Flow
*/

private val myprivate: String = "Private Reahoo"
@PublishedApi
internal val myname: String = "Reahoo"
val myname_: String = "Reahoo_"

inline fun inlined(block: () -> Unit) {
    println("Before")
    block()
    println("After")
    //println("Access from private $myprivate")
    println("Access from internal $myname")
    println("Access from public $myname_")
}

/** Not Inline */
fun nonInlined(block: () -> Unit) {
    println("Before")
    block()
    println("After")
    println("Access from private $myprivate")
    println("Access from internal $myname")
    println("Access from public $myname_")
}

inline fun calculateMyTax(lambdas: () -> Unit, noinline block: () -> Unit) {
    println("Header")
    lambdas()
    block() //no inline
    println("Footer")
}

/** Crossinline */
/*
    - The crossinline marker is used to mark lambdas that mustn’t allow non-local returns,
        especially when such lambda is passed to another execution context such as a higher order function that is not inlined,
        a local object or a nested function. In other words, you won’t be able to do a return in such lambdas.

 */
inline fun doNotAllowReturn( crossinline lambdas: () -> Unit) {
    println("Header")
    lambdas() // this is not allow to return
    //block() //no inline and allow to return
    println("Footer")
}


/***
 * Testing Method
 */

fun callingFunction() {
    inlined {
        println("Non-local control flow")
        return //Return from Lambdas
    }
}

fun callingDoNotAllowReturn() {
    doNotAllowReturn({
        println(">>>>This is inline")
        //return  not allow to return
       // return
    })
}

fun main(args: Array<String>) {
    //Test Inline
    inlined { println(">>> Hello! I didn't create instance. You can checked in byte code.") }

    //Test Not Inline
    nonInlined { println(">>>Hello I create instance. You can checked in byte code.") }


    //Test Calling Function
    callingFunction()

    //Inline + NonInline Function Param
    calculateMyTax({
        println("This is inline")
    }, {
        println("This is noinline")
    })

    //Test crossinline
    callingDoNotAllowReturn()
}
