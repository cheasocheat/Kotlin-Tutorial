package main

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 10:45
 */

open class BaseProgrammer constructor(_id: Int, _name: String, _age: Int) {
    var id: Int
    var name: String
    var age: Int
    lateinit var bDate: String

    init {
        id = _id
        name = _name
        age = _age
    }

    constructor(_id: Int, _name: String, _age: Int, _bDate: String) : this(_id, _name, _age) {
        id = _id
        name = _name
        age = _age
        bDate = _bDate
    }

    open fun printMe(){

    }
}