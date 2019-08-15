package chap08.section3

import java.util.*

fun main() {
    //books
    val booksName = arrayOf("java", "c", "c++", "kotlin", "c#", "html")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f


    // Scanner 객체에 System.in이라는 InputStream을 넣어서 scanner에 저장
    // `in`으로 감싼 이유는 in이 예약어이기 때문
    val scanner = Scanner(System.`in`)

    println("** Welcome to Ori's bookstore **")
    do {
        println(Arrays.toString(booksName))
        println("What kind of book do you want?")
        print("Answer: ")

        //\n을 포함하는 한 줄을 읽고 \n을 버리고 남은 문자열 반환 및 할당
        val book = scanner.nextLine()

        if (booksName.contains(book.toLowerCase())) {
            println("The book you choose is $book. The price is \$200")
            println("There is a discount for students and teachers" +
                    "\nWhat is your occupation(student, teacher, etc)?")
            print("Answer: ")
            val occupation = scanner.nextLine()

            when (occupation.toLowerCase()) {
                "student" -> calculatePrice(price, studentDiscount)
                "teacher" -> calculatePrice(price, teacherDiscount)
                else -> println("The discount cannot be applied" +
                        "\nThe final price is \$200.")
            }
        } else if (book == "exit" || book == "q") {
            break
        } else {
            println("I'm sorry. No inventory of $book")
        }
    } while (true)
}

private fun calculatePrice(orig: Float, x: Float): Unit {
    val result = orig - (orig * x)
    println("The final price is \$$result.")
}