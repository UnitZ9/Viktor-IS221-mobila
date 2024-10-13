fun Verh(stroka: String): String {
    val vivod = stroka.toUpperCase()
    return vivod
}

fun main() {
    println("Введите строку: ")
    val stroka = readLine() ?: ""

    val otvet = Verh(stroka)
    println("Эта же строка, но в верхнем регистре: \n$otvet")
}
