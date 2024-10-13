import java.util.Scanner

fun summaMassiva(chisla: IntArray): Int {
    var sum = 0
    for (chislo in chisla) {
        sum += chislo
    }
    return sum
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите количество элементов массива:")
    val razmer = scanner.nextInt()
    val massa = IntArray(razmer)

    println("Введите элементы массива через пробел:")
    for (i in 0 until razmer) {
        massa[i] = scanner.nextInt()
    }
    val result = summaMassiva(massa)
    println("Сумма массива: $result")
}
