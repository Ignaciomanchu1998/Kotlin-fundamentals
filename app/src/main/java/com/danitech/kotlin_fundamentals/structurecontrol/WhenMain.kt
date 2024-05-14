package structurecontrol

// Learning when statement
fun main() {
    val isLoggedIn = false

    when (isLoggedIn) {
        true -> println("El usuario ya ha iniciado sesión")
        false -> println("El usuario no ha iniciado sesión")
    }

    val userName = "samuel"

    val userStatusString = when (userName) {
        "john" -> "El usuario es John"
        "jane" -> "El usuario es Jane"
        "ignacio" -> "El usuario es Ignacio"
        "pedro" -> "El usuario es Pedro"
        "cachos" -> "El usuario es Cachos"
        else -> "User not found"
    }

    println("System to say: $userStatusString")
}