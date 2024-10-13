fun NalichieStroki(stroka1: String, stroka2: String): Boolean {
    return stroka1.contains(stroka2)
}


fun main() {
    println("Введите первую строку: ")
    val stroka1 = readLine()!!.toString()
    println("Введите строку, которую вы хотите проверить на наличие в первой: ")
    val stroka2 = readLine()!!.toString()

    println("В первой строке содержится вторая строка: ${NalichieStroki(stroka1, stroka2)}")
}
