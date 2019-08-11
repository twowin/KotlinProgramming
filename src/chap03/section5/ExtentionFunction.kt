package chap03.section5

fun main() {
    val source = "Hello World!"
    val target = "Kotlin Kotlin Kotlin "

    println(source.getLongString(target))
}

// String을 확장해 getLongString 추가
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target