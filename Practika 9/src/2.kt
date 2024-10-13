fun countOfGlasnieAndSoglasnie(text: String): Any {
    var Count = 0
    var Count2 = 0
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y', 'ё', 'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'Ё', 'У', 'Е', 'Ы', 'А', 'О', 'Э', 'Я', 'И', 'Ю')
    for (char in text) {
        if (char.isLetter()) {
            if (char in vowels) {
                Count++
            }
            else Count2++
        }
    }
    return (println("Число гласных: $Count \nЧисло согласных: $Count2"))
}

fun main() {
    println("Введите строку: ")
    val stroka = readLine()!!.toString()
    val otvet = countOfGlasnieAndSoglasnie(stroka)
}