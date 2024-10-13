fun isPalindrome(stroka: String): Boolean {
    val vvod = stroka.replace(" ", "").toLowerCase()
    return vvod == vvod.reversed()
}

fun main() {
    println("Введите строку для проверки на палиндром:")
    val stroka = readLine() ?: ""

    if (isPalindrome(stroka)) {
        println("Строка является палиндромом.")
    } else {
        println("Строка не является палиндромом.")
    }
}
