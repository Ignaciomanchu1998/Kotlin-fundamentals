package com.danitech.kotlin_fundamentals.estructura_control

import kotlin.system.measureNanoTime

fun main() {
    println("====== For In======")
    val forIn = measureNanoTime {
        for(i in 0..1000) {
            i
        }
    }
    println("For Time: $forIn")

    val forEach = measureNanoTime {
        (0..1000).forEach { it  }
    }
    println("ForEach Time: $forEach")

    val objectList = (0..1000).toList()

    val forInList = measureNanoTime {
        for(i in objectList) {
            i
        }
    }
    println("For in List $forInList")

    val forEachList = measureNanoTime {
        objectList.forEach { it }
    }
    println("For each List $forEachList")

    /*
        Para Rangos => For In
        ForEach => Recomendable para trabajar con colecciones (Listas)
    */
}