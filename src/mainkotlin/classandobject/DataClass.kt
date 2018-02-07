package mainkotlin.classandobject

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 14:16
 */
data class UserS(val name : String, var age : Int)

fun main(args: Array<String>) {
    var obj = UserS("Reahoo", 23)
    println(obj.toString())
    println(obj.hashCode())

    println()

    var obj2 = obj.copy(name = "Sochea",age = 45)
    println(obj2.toString())
    println(obj2.hashCode())


    println()

    var obj3 = obj.copy()
    println(obj.equals(obj3))


    //Destructive Declaration
    println(obj.name)
    println(obj.age)
}