package chap02.section3

fun main() {
    var test: Number = 12.2 // 12.2에 의해 test는 Float 형으로 스마트 캐스트
    println("$test")

    test = 12
    println("$test") // Int형으로 스마트 캐스트

    test = 120L
    println("$test") // Long형으로 스마트 캐스트

    test += 12.0f
    println("$test") // Float형으로 스마트 캐스트

    test += 18L
    println("$test")

}