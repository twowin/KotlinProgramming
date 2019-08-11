package chap05.section6

class Car(val name: String, val power: String){
    private var engine = Engine(name, power)

    fun startEngine() = engine.start()
}

class Engine(val name: String, val power: String) {
    fun start() = println("$name's engine is $power, and it has been started")
}

fun main() {
    val car = Car("tico", "100hp")
    car.startEngine()
}