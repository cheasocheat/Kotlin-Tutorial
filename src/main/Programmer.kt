package main

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 10:46
 */

class Programmer(_id: Int, _name: String, _age: Int) : BaseProgrammer(_id, _name, _age) {
    var salary: Double = 0.0

    constructor(_id: Int, _name: String, _age: Int, _salary: Double) : this(_id, _name, _age) {
        this.salary = _salary
    }

    override fun printMe() {
        println("[ $id / $name / $age / $salary]")
    }
}