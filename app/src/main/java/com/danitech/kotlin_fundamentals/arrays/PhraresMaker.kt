package arrays

fun main() {
    val grettins = arrayOf("Turasha", "Hi", "Hola", "Bienvenido a ", "Excelente, te esperamos")
    val introducctions = arrayOf("mi nombre es", "me puedes decir", "usualmente me dicen", "yo soy")
    val names = arrayOf("Danis", "Dan", "Dani", "Manchu")

    var randNumberGretting = (Math.random() * grettins.size).toInt()
    var randNumberIntroducction = (Math.random() * introducctions.size).toInt()
    var randNumberName = (Math.random() * names.size).toInt()

    val phrase = "${grettins[randNumberGretting]} ${introducctions[randNumberIntroducction]} ${names[randNumberName]}"

    println(phrase)
}