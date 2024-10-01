fun main() {
    println("Введите слово (на Английском):")
    val slovo = readLine().toString()
    val x:String = slovo.lowercase().replace("""\W""".toRegex(), "").reversed().toString()

    if (x == slovo.lowercase().replace("""\W""".toRegex(), "")) {
        println("$slovo является палиндромом.")
    } else {
        println("$slovo не является палиндромом.")
    }
}