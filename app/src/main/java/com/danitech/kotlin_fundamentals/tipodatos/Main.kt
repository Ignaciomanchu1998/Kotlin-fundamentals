package com.danitech.kotlin_fundamentals.tipodatos

fun main() {

    val userStatus = 8
    val userStatusString = when (userStatus) {
        1 -> "Activo"
        2 -> "Inactivo"
        3 -> "Bloqueado"
        in 4..20 -> "Inhabilitado temporalmente por $userStatus días"
        else -> "Desconocido"
    }
    println("El estado del usuario es: $userStatusString")

    // Any => Cualquier tipo de dato en Kotlin.

    val productPrices: Any = doubleArrayOf(12.5, 23.5, 45.5, 67.5)


    when (productPrices) {
        is DoubleArray -> {
            println("El arreglo de precios es de tipo DoubleArray")
            val sum = productPrices.sum()
            println("La suma de los precios es: $sum")
        }
        is Int -> {
            println("El precio es de tipo Int")
            println("Error inesperado")
        }
        is Double -> {
            println("El precio es de tipo Double")
            println("Error inesperado")
        }
        else -> {
            println("Is unknown")
        }
    }
}