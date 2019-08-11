package chap04.section1

class MyClass

fun main() {
    cases("Hello") // String
    cases(1) // Int
    cases(System.currentTimeMillis()) // Long
    cases(MyClass()) // 객체

    // 여기서부터는 개인 테스트
    println("=================")
    cases(2)
    cases("Test")
    fun testFunc() = print("Test Function: ")
    cases(testFunc())
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

