fun Simvoli(stroka: String): Int {
    return stroka.length
}

fun main() {
    println("Введите строку: ")
    val stroka = readLine() ?: ""

    val chisloSimvolov = Simvoli(stroka)
    println("Количество символов в строке: $chisloSimvolov")
}
