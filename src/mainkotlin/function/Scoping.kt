package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 01:07
 */

//With the help of these functions (let, run, with, apply and also),
// we can operate on objects within a certain context.

//https://medium.com/@elye.project/mastering-kotlin-standard-functions-run-with-let-also-and-apply-9cd334b0ef84
// run, with, T.run, T.let, T.also and T.apply

//https://kotlin.guide/scoping-functions
/**
 *
 * There are 3 attributes of scoping functions
 *  1. Normal vs. extension function
 *  2. This vs. it argument
 *  3. Return this vs. other type
 */

/**
    also: additional processing on an object in a call chain
    apply: post-construction configuration
    let: conversion of value
    run: execute lambdas with side-effects and no result
    with: configure objects created somewhere else
 * */


class Person {
    var firstName: String
    var lastName: String
    var age: Int

    init {
        firstName = ""
        lastName = ""
        age = 0
    }

    //Let return result of lambdas
    //Super-useful for conversions:
    val com = firstName.let {
        "First Name"
    }
}

fun test() {
    var mood = "I am sad"

    run {
        val mood = "I am happy"
        println(mood) // I am happy
    }
    println(mood)  // I am sad
}


fun main(args: Array<String>) {
    test()

    /**
     * Use apply for initialization:
     * */
    var foo = test().apply {
        println("WTF Test")
    }

    //Without Apply
    val person = Person()
    person.firstName = "Reahoo"
    person.lastName = "Super"
    person.age = 23

    //WIth apply
    val person2 = Person().apply {
        this.firstName = "Reahoo"
        lastName = "Super"
        this.age = 60
    }

    //WIth Also
    val pserosn3 = Person().also {
        it.firstName = "Reahoo"
        it.lastName = "Super"
        it.age = 23
    }

    // ==>: They both return the calling object. (Also , Apply)
    println(person.com)


    println("===== RUN & LET======")
    //Run similar to do sth of initialize object or want to ad more on object function
    val result = person2.run { age * 2 }
    println(result)

    val nRes = person2.let { it.age * 2 }
    println(nRes)

    val text: String? = "hello"
    text.run { println(text) }


    println("===== WITH ======")
    val mResult = with(person2) {
        this.age * 2
    }
    println(mResult)
}