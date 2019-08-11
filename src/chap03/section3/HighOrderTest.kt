package chap03.section3

fun main() {
    val result: Int

    // 일반 변수에 람다식 할당
    val multi = {x: Int, y: Int -> x * y}

    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)

    val greet: () -> Unit = {println("Hello")}
    println(greet)
    greet()

    val nestedLambda: () -> () -> Int = {{20}}
    val test = nestedLambda()()
    println(test)

    testCode()
}

fun testCode() {
    var result: Int
    val square = {x: Int -> x * x}

    result = square(2)
    println(result)
}