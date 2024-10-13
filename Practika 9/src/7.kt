fun swapCase(stroka: String): String {
    val otvet = StringBuilder()
    for (char in stroka) {
        if (char.isUpperCase()) {
            otvet.append(char.toLowerCase())
        } else if (char.isLowerCase()) {
            otvet.append(char.toUpperCase())
        } else {
            otvet.append(char)
        }
    }
    return otvet.toString()
}

fun main() {
    println("Введите строку: ")
    val stroka = readLine()!!
    val swappedStroka = swapCase(stroka)
    println("Измененная строка: $swappedStroka")
}