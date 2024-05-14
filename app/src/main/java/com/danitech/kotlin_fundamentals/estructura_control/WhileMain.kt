package com.danitech.kotlin_fundamentals.estructura_control

fun main() {
    val grettins = arrayOf("Hello", "Hola", "Ciao", "Hallo", "Saluton", "Turasha", "Ayu")

    // Tratando de entender los iteradores.
    val namesIterator = grettins.iterator()
    while (namesIterator.hasNext()) {
        println("Iterator ${namesIterator.next()}")
    }

    // Usando while.
    println("======================== While ===========================")
    var while_iterator = 0

    while (while_iterator <= grettins.size - 1) {
        println(grettins[while_iterator])
        while_iterator++
    }

    // Usando while.
    println("======================== Do While ===========================")
    var do_while_iterator = 2

    do {
        println(grettins[do_while_iterator])
        do_while_iterator++
    } while (do_while_iterator <= grettins.size - 1)

}