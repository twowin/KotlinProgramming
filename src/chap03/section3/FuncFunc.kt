package chap03.section3

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun funcSum(a: Int, b: Int) = a + b

fun funcFunc(): Int {  // 함수의 반환값으로 함수 사용
    return funcSum(2, 2)
}
