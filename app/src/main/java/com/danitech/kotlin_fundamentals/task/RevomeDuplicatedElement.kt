package com.danitech.kotlin_fundamentals.task


fun main() {
    val list: Array<Int> = arrayOf(0, 0, 1, 1, 2, 2, 3, 3, 4)

    var index = 1

    for (i in 1 until list.size) {
        val indexIzq = i - 1

        if (list[i] == list[indexIzq]) {
            list[index] = list[i]
            index++
        }
    }

    for (k in index until list.size) {
        list[k] = 0
    }
    println(list.joinToString(", "))

}