package chap05.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}

class C : A(), B { // 콤마(,)를 사용해 클래스와 인터페이스를 지정
    override fun f() = println("C Class f()")
    fun test() {
        f() // 현재 클래스의 f()
        b() // 인터페이스 B의 b()

        super<A>.f() // A 클래스의 f()
        super<B>.f() // B 클래스의 f()

        a() // ** 테스트
    }
}

fun main() {
    val c = C()
    c.test()
}