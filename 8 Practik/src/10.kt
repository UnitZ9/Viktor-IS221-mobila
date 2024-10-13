fun repetition(txt: String, n: Int): String {
    if (n <= 0) {
        return ""
    }
    return txt + repetition(txt, n - 1)
}

fun main() {
    println(repetition("dingo ", 3))  // "dingo dingo dingo "
    println(repetition("pustota", 0)) // ""
}




/*
import java.util.Scanner
fun repetition(txt: String, n: Int): String {
    if (n <= 0) {
        return ""
    }
    return txt + repetition(txt, n - 1)
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите строку для повторения:")
    val txt = scanner.nextLine()
    println("Введите количество повторений:")
    val n: Int = scanner.nextInt()

    if (n < 0) {
        println("Количество повторений не может быть неотрицательным.")
    } else {
        val otvet = repetition(txt, n)
        println("Результат: $otvet")
    }
    scanner.close()
}
*/