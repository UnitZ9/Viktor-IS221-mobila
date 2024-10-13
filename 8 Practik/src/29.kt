import java.util.Scanner

fun MaxAndMinOfMassa(numbers: IntArray, razmer:Int): String {
    var max = numbers[0]
    var min = numbers[razmer-1]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return ("Максимальное значение массива: $max\nМинимальное значение массива: $min")

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
    val maxandminofMassa = MaxAndMinOfMassa(massa, razmer)
    println("$maxandminofMassa")
}
