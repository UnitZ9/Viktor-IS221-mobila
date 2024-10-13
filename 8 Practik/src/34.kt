fun DeleteProbel(строка: String): String {
    return строка.replace(" ", "")
}

fun main() {
    println("Введите строку: ")
    val stroka = readLine().toString()
    val otvet = DeleteProbel(stroka)
    println(otvet)
}