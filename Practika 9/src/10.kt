fun findLongestWord(stroka: String): String {
    val slova = stroka.split("\\s+".toRegex())
    var dlinoeSlovo = slova[0]
    for (slovo in slova) {
        if (slovo.length > dlinoeSlovo.length) {
            dlinoeSlovo = slovo
        }
    }
    return dlinoeSlovo
}

fun main() {
    println("Введите строку:")
    val stroka = readLine()!!
    val dlinoeSlovo = findLongestWord(stroka)
    println("Самое длинное слово: $dlinoeSlovo")
}