package holamundo

fun main() {

    // val => es una constante.
    // var => es una variable que puede cambiar su valor (Reutilizable).

    val firstNameOfDeveloper: String = "Manchu Danis"
    var variableReutilizable: String = "Hola mundo"
    var isFinished: Boolean = false

    println(firstNameOfDeveloper)
    println(variableReutilizable)
    println(isFinished)

    // ¿Qué pasa en Kotlin sino especifico el Tipo de Dato al declarar una variable?

    /*
        Usa la Inferencia de Datos. - El compilador separa la declaración en 2 partes:
        1. - El derecho del igual.
        2. - Por otro lado, el lado izquierdo del igual.

        Entonces, el compilador primero lee lo que está en la parte derecha y analiza
        valor para asignar el Tipo de Dato.


        En Kotlin, no guardamos la data en si en la memoria, sino simplemente una referencia

        Tomar en cuenta que en Kotlin, se necesita saber al menos tipos de caracteristicas
        de la variable para declarar

        1. -Nombre
        2. -Tipo
        3. - ¿Puede reutilizarse?

    * */
}