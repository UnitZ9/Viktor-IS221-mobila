fun getDlina(stroka: String): Int {
    return stroka.length
}

fun main() {
    println("Введите строку: ")
    val stroka = readLine()!!.toString()
    val dlina = getDlina(stroka)
    println("Длина строки: $dlina")
}
