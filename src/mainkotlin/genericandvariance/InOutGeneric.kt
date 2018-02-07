package mainkotlin.genericandvariance

/**
 *    Developer : cheasocheat
 *    Created on 2/8/18 00:23
 */

//SuperType could be assigned subtype, use IN
//SubType could be assigned to SuperType, use OUT


//Out (covariant type)

//In (contravariance type)

// No In No Out is invariance

interface Production<out T>{
    fun produce() : T
}

interface Consumer<in T> {
    fun consume(item: T)
}

open class Food

open class FastFood : Food()

class Burger : FastFood()

class FoodStore : Production<Food>{
    override fun produce(): Food {
        println("Produce Food")
        return Food()
    }
}

class FastFoodStore : Production<FastFood>{
    override fun produce(): FastFood {
        println("Produce Fast Food")
        return FastFood()
    }
}

class InOutBurger : Production<Burger>{
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}

class EveryBody : Consumer<Food>{
    override fun consume(item: Food) {
        println("Eat food")
    }
}

class ModernPeople : Consumer<FastFood>{
    override fun consume(item: FastFood) {
        println("Eat FastFood")
    }
}

class American : Consumer<Burger>{
    override fun consume(item: Burger) {
        println("Eat Burger")
    }
}

fun main(args: Array<String>) {
    val production1 : Production<Food> = FoodStore()
    val production2 : Production<Food> = FastFoodStore()
    val production3 : Production<Food> = InOutBurger()

    //Production<Food>
    // ==> FoodStore can produce Food
    // ==> FastFoodStore can produce Food
    // ==> BurgerStore can produce food

    //Production<FastFood>
    // ==> FoodStore can't produce FastFood
    // ==> FastFoodStore can produce FastFood
    // ==> BurgerStore can produce FastFood

    //Production<Burger>
    // ==> FoodStore can't produce Burger
    // ==> FastFoodStore can't produce Burger
    // ==> BurgerStore can produce Burger


   /* val production1_ : Production<FastFood> = FoodStore()
    val production2_ : Production<FastFood> = FastFoodStore()
    val production3_ : Production<FastFood> = InOutBurger()*/


    val consumer1 : Consumer<Burger> = EveryBody()
    val consumer2 : Consumer<Burger> = ModernPeople()
    val consumer3 : Consumer<Burger> = American()
    // ==> Everybody can consume Food
    // ==> ModerPeople can't consume Food
    // ==> American can't consume Food

    //But
    // ==> Everybody can consume FastFood
    // ==> ModerPeople can consume FastFood
    // ==> American can't consume FastFood

    //And
    // ==> Everybody can consume Burger
    // ==> ModerPeople can consume Burger
    // ==> American can consume Burger

    /*val consumer1_ : Consumer<Food> = EveryBody()
    val consumer2_ : Consumer<Food> = ModernPeople()  // Error
    val consumer3_ : Consumer<Food> = American()  // Error*/

}