import com.example.edu.Person as User


fun main() {
    println("Hello Kotlin!")

    val person = User("Wooseung",38)
    val person2 = Person(123, "Lucy", "Programmer")

    println(person)
    println(person.name)
    println(person.age)

}

class Person(val no: Int, val name: String, val jogTitle: String)