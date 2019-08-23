package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("src/chap10/section1/output.txt")).use {
        it.println("hello")
    }

    val file = File("src/chap10/section1/contents.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
}