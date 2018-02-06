package main

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 11:08
 */
interface ProgrammerRepository {
    //Can't use this stle
    var hep: String

    //Initialize value inside interface
    val prop : Int
    get() = 45

    fun getById(id : Int) : Programmer
}

class hello : ProgrammerRepository{
    override fun getById(id: Int): Programmer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val prop: Int
        get() = 23

    override var hep: String = "GG"
}