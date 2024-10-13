import java.util.Scanner

fun sortArray(chisla: IntArray): IntArray {
    chisla.sort()
    return chisla
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите количество элементов массива: ")
    val razmer = scanner.nextInt()
    val massa = IntArray(razmer)

    println("Введите элементы массива через пробел: ")
    for (i in 0 until razmer) {
        massa[i] = scanner.nextInt() // Заполняем массив элементами
    }

    val sortirivaniMassiv = sortArray(massa) // Сортируем массив
    println("Отсортированный массив: ${sortirivaniMassiv.joinToString(", ")}")
}
