package chap05.section2.bird3

class Bird (var name: String = "bird", var wing: Int = 2, var beak: String, var color: String){

    init {
        println("초기화 블록 시작")
        println("name: $name, beak: $beak")
        this.sing(2)
        println("초기화 블록 끝")
    }

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird("mybird", 2, "long", "yellow")
    val coco2 = Bird(beak = "long", color = "red")

    coco.color = "Blue"

    println("coco.name: ${coco.name}")
    println("coco.color: ${coco.color}")
    println("coco2.beak: ${coco.beak}, coco2.color: ${coco2.color}")
    coco.fly()
    coco.sing(3)
}

