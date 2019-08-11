package chap03.section6

fun a() = b()
fun b() = println("b")

fun c() {

    fun e() = println("e")
    fun d() = e()
    d()
}

fun main() {
    a()
    c()
}