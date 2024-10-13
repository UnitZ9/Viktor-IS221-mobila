fun googleWithO(chislo: Int): String {
    return "G" + "o".repeat(chislo) + "gle"
}

fun main() {
    println("Введите число:")
    val chislo = readLine()?.toIntOrNull() ?: return
    val otvet = googleWithO(chislo)
    println(otvet)
}
