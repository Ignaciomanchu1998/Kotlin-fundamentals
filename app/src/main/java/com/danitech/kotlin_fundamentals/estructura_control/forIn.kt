package com.danitech.kotlin_fundamentals.estructura_control

fun main() {
    println("====================== Applying range ======================")
    for (i in 0..10) {
        println("Item $i")
    }

    println("====================== Applying rangeTo ======================")
    for (i in 0.rangeTo(20)) {
        println("Item up $i")
    }

    println("====================== Applying downTo ======================")
    for (i in 10 downTo 0) {
        println("Item down $i")
    }

    println("=========== Applying in Character ==============")
    for (c in 'a'..'z') {
        println("Character $c")
    }

    println("=========== Applying in String down ==============")
    for (v in 'z'.downTo('a')) {
        println("Character $v")
    }

    val greetings = arrayOf("Good Morning", "Good Afternoon", "Good Evening")

    println("=========== Applying in Array ==============")
    for (greeting in greetings) {
        println("Greeting: $greeting")
    }

    println("=========== Applying in Array with index ==============")
    for ((index, greeting) in greetings.withIndex()) {
        println("Greeting $index: $greeting")
    }

    println("=========== Applying in Array with indices ==============")
    for (item in greetings.indices) {
        println("Greeting $item: ${greetings[item]}")
    }

    println("=========== Applying in Array with until ==============")
    for (i in 0 until greetings.size) {
        println("Greeting $i: ${greetings[i]}")
    }
}