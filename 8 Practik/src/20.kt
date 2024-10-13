import java.util.Scanner

fun MaxOfMassa(numbers: IntArray): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите количество элементов массива: ")
    val razmer = scanner.nextInt()
    val massa = IntArray(razmer)

    println("Введите элементы массива через пробел: ")
    for (i in 0 until razmer) {
        massa[i] = scanner.nextInt()
    }
    val maxofMassa = MaxOfMassa(massa)
    println("Максимальное значение массива: $maxofMassa")
}
