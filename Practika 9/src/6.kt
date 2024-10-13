import java.util.*

fun sortStringsAlphabetically(massa: Array<String>): Array<String> {
    return massa.sortedArray()
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите количество строк: ")
    val n = scanner.nextInt()
    val massa = Array(n) { "" }
    println("Введите строки: ")
    for (i in 0 until n) {
        massa[i] = scanner.next()
    }

    val sortedStrings = sortStringsAlphabetically(massa)
    println("Отсортированный массив строк: ")
    sortedStrings.forEach { println(it) }
}