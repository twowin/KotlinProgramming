package chap05.section5

fun main() {
    val otheric = InternalClass()

    println(otheric.i)
    otheric.icFunc()

    // ** test
    println(otheric.i)
    otheric.icFunc()
    println(otheric.i)
}