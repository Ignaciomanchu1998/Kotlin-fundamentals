package conversiondatos

fun main() {
    // Todos los tipos de datos son objetos

    val productLowStock: Byte = 20
    val productStock = productLowStock.toInt()

    val productInInventory = "50"
    val convertProductInInventory = productInInventory.toByte()

    println(productStock)
    println(convertProductInInventory)



    val longitudPulgaMM = 2
    val longitudPulgaCM = longitudPulgaMM.toFloat() / 10
    val salto = 30

    val text = "Si una pulga mide $longitudPulgaMM mm. podría dar un salto de $salto veces la longitud de su cuerpo, es decir: ${salto * longitudPulgaCM} cm."

    println(text)
}