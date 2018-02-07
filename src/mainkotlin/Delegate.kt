package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 16:43
 */

interface Human{
    fun pickUpChildrenFromSchool()
}
class Mama(val age : Int) : Human {
    override fun pickUpChildrenFromSchool() {
        println("Mama is $age years old. She can't pick up her kid.")
    }
}

class Father(delegate: Human) : Human by delegate{
    override fun pickUpChildrenFromSchool() = println("Father will go to pickup children from school!")
}

class Mother(delegate: Human) : Human by delegate{
    override fun pickUpChildrenFromSchool() = println("Mother will go to pickup children from school!")
}

fun main(args: Array<String>) {
    //Mama miss her kid
    //She want her kid play around but kid are at school she want to pick them up
    var mama = Mama(70)
    mama.pickUpChildrenFromSchool()

    //She call the kid's mother to pick up but she busy, she delegate to father to pick children
    var mom = Mother(mama).pickUpChildrenFromSchool()


    //But Mother she felt dizzy can't drive . then she delegate this task to kid's father to pick
    //Mama is ordering mother, but mother delegate order to father
    Father(mama).pickUpChildrenFromSchool()
}