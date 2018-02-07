package mainkotlin

/**
 *    Developer : cheasocheat
 *    Created on 2/6/18 11:51
 */

interface B{
    fun f(){
        println("B")
    }
}

open class A{
    open fun f(){
        println("A")
    }

}

class C : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}


fun main(args: Array<String>) {
    var c = C()
    c.f()
}