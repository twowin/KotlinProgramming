package chap06.section2

class Person(val name: String, val age: Int)


fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person by lazy {  // (1) lazy를 사용한 person 객체의 초기화
        isPersonInstantiated = true
        Person("Kim", 23) // (2) 이 부분이 Lazy 객체로 반환됨
    }
    val personDelegate = lazy { Person("Hong", 40) }  // (3) 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")  // 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}")  // 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}