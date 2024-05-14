package structurecontrol

fun main() {
    val isLoggedIn = true
    val hasAddress = true

    if (!isLoggedIn) {
        println("This user is not logged in")
    }

    if (isLoggedIn && !hasAddress) {
        println("This user does not have an address")
    }

    if (isLoggedIn && hasAddress) {
        println("Welcome, to the Admin system")
        println("Your address is verified, you can access your account")
    }
}