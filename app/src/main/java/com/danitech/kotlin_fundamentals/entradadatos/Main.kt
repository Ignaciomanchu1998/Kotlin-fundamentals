package entradadatos

fun main() {
    var username: String
    var edad: Int

    println("===== SISTEMA DE USUARIOS =======")
    println("Ingresa tu nombre de usuario: ")
    username = readln()
    println("Hola $username, bienvenido al sistema")

    println("Ingresa tu edad: ")
    edad = readln().toInt()
    println("Excelente, nos alegra que tengas $edad años")
}