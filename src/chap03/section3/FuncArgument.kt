package chap03.section3

fun main() {
    val res1 = sum(10, 3) // 일반 인자
    val res2 = mul(sum(3, 3), 2) // 인자에 함수를 이용

    println("res1: $res1, res2: $res2")
}

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b

