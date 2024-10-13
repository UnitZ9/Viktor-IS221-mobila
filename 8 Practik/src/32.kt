fun reverse(spisok: String): String {
    return spisok.reversed()
}



fun main() {
    println("Введите строку:")
    val stroka = readLine().toString()


    val reverseStroki = reverse(stroka)
    println("Объединённая строка: \n$reverseStroki")
}
