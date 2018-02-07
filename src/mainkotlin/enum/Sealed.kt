package mainkotlin.enum

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 14:25
 */
sealed class Expr {
    data class Const(val value: Double) : Expr()
    data class Sum(val left: Expr, val right: Expr) : Expr()
    object NotANumber : Expr()

    fun eval(e: Expr): Double =
            when (e) {
                is Const -> e.value
                is Sum -> eval(e.right) + eval(e.left)
                NotANumber -> Double.NaN
            }

}


fun main(args: Array<String>) {
    val obj: Expr = Expr.Const(4.0)
    val output = obj.eval(obj)
    println(output)

    println()

    val obj2 : Expr = Expr.Sum(obj, obj)
    val output2 = obj.eval(obj2)
    println(output2)


    println()

    val obj3 : Expr = Expr.NotANumber
    val output3 = obj.eval(obj3)
    println(output3)

}

