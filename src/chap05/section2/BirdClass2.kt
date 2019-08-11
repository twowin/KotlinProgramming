package chap05.section2

class Bird {

    // 프로퍼티
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 부 생성자
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    constructor(_name: String, _color: String) {
        name = _name
        color = _color
        wing = 2
        beak = "short"
    }
    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird("mybird", 2, "long", "yellow")
    val coco2 = Bird("mybird2", "Red")

    coco.color = "Blue"

    println("coco.name: ${coco.name}")
    println("coco.color: ${coco.color}")
    println("coco2.name: ${coco2.name}")
    println("coco2.color: ${coco2.color}, coco2.beak ${coco2.beak}")
    coco.fly()
    coco.sing(3)
}

