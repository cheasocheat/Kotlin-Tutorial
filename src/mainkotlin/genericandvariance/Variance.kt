package mainkotlin.genericandvariance

/**
 *    Developer : cheasocheat
 *    Created on 2/7/18 23:00
 */

/**
 * variance: covariance, contravariance and invariance
 */


abstract class Animal(val size: Int)
class Dog(val cuteness: Int): Animal(100)
class Spider(val terrorFactor: Int): Animal(1)

interface Compare<T>{
    fun compare(first : T, second : T) : Int
}

fun main(args: Array<String>) {

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("Variance")
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
    //Variance : Tell about relationship of sub type and its super-type
    //Dog is sub type of Animal

    val dog: Dog = Dog(10)
    val spider: Spider = Spider(9000)
    var animal: Animal = dog
    animal = spider

    println(spider.terrorFactor)

    println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("Covariance")
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")

    //Sub Type Can assigned value to its base
    // List<Dog> is sub type of List<Animal>

    val dogList: List<Dog> = listOf(Dog(10), Dog(20))
    val animalList: List<Animal> = dogList


    println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("invariance")
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
    //Sub Type can not assigned value to super type
    //Base on java

    println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("Contravariance")
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")

    //Can only compare dog , because only dog has cuteness
    // Can be called cotravariance
    val dogCompare: Compare<Dog> = object: Compare<Dog> {
        override fun compare(first: Dog, second: Dog): Int {
            return first.cuteness - second.cuteness
        }
    }

    //val animalCompare: Compare<Animal> = dogCompare // Don't work

    //TO compare all
    val animalCompare: Compare<Animal> = object: Compare<Animal> {
        override fun compare(first: Animal, second: Animal): Int {
            return first.size - second.size
        }
    }

    //val spiderCompare: Compare<Spider> = animalCompare // Works nicely!


    //Right
}