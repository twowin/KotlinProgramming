package chap08.section2

import java.util.*

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    val sortedNums = arr.sortedArray()
    println("ASC: " + Arrays.toString(sortedNums))

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DES: " + Arrays.toString(sortedNumsDesc))

    arr.sort(1, 3)
    println("ORI: " + Arrays.toString(arr))
    arr.sortDescending()
    println("ORI: " + Arrays.toString(arr))

    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: " + listSorted)
    println("LST: " + listDesc)

    val items = arrayOf<String>("Dog", "Cat", "Loin", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
}