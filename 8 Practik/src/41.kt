fun countOfGlasnie(text: String): Int {
    var vowelCount = 0
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y', 'ё', 'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'Ё', 'У', 'Е', 'Ы', 'А', 'О', 'Э', 'Я', 'И', 'Ю')
    for (char in text) {
        if (char in vowels) {
            vowelCount++
        }
    }
    return vowelCount
}

fun main() {
    println("Введите строку: ")
    val stroka = readLine()!!.toString()
    val glasnie = countOfGlasnie(stroka)
    println("В строке '$stroka' \n$glasnie гласных.")
}