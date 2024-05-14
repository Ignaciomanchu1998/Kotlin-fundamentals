package com.danitech.kotlin_fundamentals.funciones

fun main() {
    val userName = "Developer"
    println(addStartsFormat("My Scanner To Face App", 4))
    println(addStartsFormat("Welcome to the best experience", 2))
    println(addStartsFormat("Hello $userName", 1))
}

fun addStartsFormat(appName: String, startsNumber: Int): String {
    val text = StringBuilder(appName)

    text.insert(0, " ")
    text.insert(text.length, " ")

    for (i in 0 until startsNumber) {
        text.insert(0, "*")
        text.insert(text.length, "*")
    }
    return text.toString()
}
