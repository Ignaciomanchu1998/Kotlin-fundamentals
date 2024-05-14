package com.danitech.kotlin_fundamentals.task

fun main() {
    println("====== Welcome To Water Program ======")

    println("Enter Temperature here: ")
    val temperature = readln().toInt()

    println("Temperature: ${getTemperature(temperature)}")
}

fun getTemperature(temperature: Int): String {
    var message = ""

    if (temperature < 20) {
        message = "Usa un Abrigo hace frío"
    }

    if (temperature in 21..30) {
        message = "e irá bien si usas una Chaqueta, el clima es templado"
    }

    if (temperature > 30) {
        message = "Es mejor que lleves algo ligero, hace calor"
    }
    return message
}