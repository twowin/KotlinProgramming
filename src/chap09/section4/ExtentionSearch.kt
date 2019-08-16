package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200), Pair("C", 300))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // first: 식에 일치하는 첫 요소 반환
    println("first: " + listPair.first { it.second == 200 })

    // last: 식에 일치하는 마지막 요소 반환
    println("last: " + listPair.last { it.second == 200 })

    // firstOrNull: 식에 일치하지 않은 경우 null 반환
    println("firstOrNull: " + listPair.firstOrNull { it.first == "C" })

    // lastOrNull: 식에 일치하지 않은 경우 null 반환
    println("lastOrNull: " + listPair.lastOrNull { it.first == "C" })
    println("------------------------")

    // single: 람다식에 일치하는 요소 하나 반환
    println("single: " + listPair.single { it.second == 100 })
    println("singleOrNull: " + listPair.singleOrNull { it.second == 500 })
    println("------------------------")

    // binarySearch: 요소에 대해 이진 탐색 후 인덱스 반환
    println("binarySearch: " + list.binarySearch(3))

    // find: 조건식을 만족하는 첫 번째 검색된 요소 반환, 없으면 null
    println("find: " + list.find { it > 3 })
    println("------------------------")
}