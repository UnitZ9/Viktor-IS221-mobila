fun isAnagram(stroka1: String, stroka2: String): Boolean {
    if (stroka1.length != stroka2.length) {
        return false
    }
    val charCounts1 = mutableMapOf<Char, Int>()
    for (char in stroka1) {
        charCounts1[char] = (charCounts1[char] ?: 0) + 1
    }
    val charCounts2 = mutableMapOf<Char, Int>()
    for (char in stroka2) {
        charCounts2[char] = (charCounts2[char] ?: 0) + 1
    }
    return charCounts1 == charCounts2
}

fun main() {
    println("Введите первую строку: ")
    val stroka1 = readLine()!!.toString()
    println("Введите вторую строку: ")
    val stroka2 = readLine()!!.toString()
    println(isAnagram(stroka1, stroka2))
}