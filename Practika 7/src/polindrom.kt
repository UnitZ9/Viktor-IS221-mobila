fun main() {
    println("Введите слово:")
    var slovo = readLine() ?: return
    slovo = slovo.replace("""\W""".toRegex(), "")
    var slovo2 = slovo.lowercase().replace("""\W""".toRegex(), "")
    slovo2 == slovo2.reversed()

    if (slovo.lowercase() == slovo2.lowercase()) {
        println("$slovo является палиндромом.")
    } else {
        println("$slovo не является палиндромом.")
    }
}