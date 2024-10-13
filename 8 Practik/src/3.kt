fun obъedinenie(spisok1: List<Int>, spisok2: List<Int>): List<Int> {
    return spisok1 + spisok2
}



fun main() {
    println("Введите первый список целых чисел через пробел:")
    val vvod = readLine()
    val spisok1 = vvod?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    println("Введите второй список целых чисел через пробел:")
    val vvod2 = readLine()
    val spisok2 = vvod2?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    val mergedSpisok = obъedinenie(spisok1, spisok2)
    println("Объединённый список: $mergedSpisok")
}
