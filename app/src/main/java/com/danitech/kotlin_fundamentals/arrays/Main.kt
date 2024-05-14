package arrays

fun main() {
    // Los arrays se deben declarar siempre en plural
    // Los arrays siempre tienen que estar consecutivamente en memoria a diferencia de colecciones
    val myArray = arrayOf(1, 2, 3, "Danis", "Manchu", 25, true)

    // Los arrays vacios se declaran de esta manera
    val numbers = emptyArray<Int>()

    // Los arrays tipados.
    val ages = intArrayOf(1, 2, 3, 4, 5)
    val verfieds = booleanArrayOf(false, true, false, true, false)
    val names = byteArrayOf( 34, 12, 34, 12, 34, 12, 34, 12, 34, 12, 34, 12, 34, 12, 34, 12, 34, 12, 34, 12)
    val characters = charArrayOf('D', 'A', 'N', 'I', 'S')

    val intArrays = IntArray(5, ) { i: Int -> i.inc() }

    intArrays.forEach {
        println(it)
    }

    val arrayBolean = BooleanArray(3) {
        println(it)
        true
    }
}