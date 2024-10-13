fun obedinenie(spisok1: String, spisok2: String): String {
    return spisok1 + spisok2
}



fun main() {
    println("Введите первую строку:")
    val stroka1 = readLine().toString()

    println("Введите вторую строку:")
    val stroka2 = readLine().toString()

    val mergedStroki = obedinenie(stroka1, stroka2)
    println("Объединённая строка: \n$mergedStroki")
}
