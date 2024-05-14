package stringtemplate

fun main() {
    val price = 15.67
    val tax = 0.12
    val total = price * (1 + tax)
    val totalConMetodoDiferente = price.times(tax.plus(1))

    val output = "The quantity of $$price after of tax is $${total.toFloat()} "
    println(output)
    println("Float ${totalConMetodoDiferente.toFloat()}")
    println("Int ${totalConMetodoDiferente.toInt()}")
    println("String $totalConMetodoDiferente")
}