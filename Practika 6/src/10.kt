import kotlin.random.Random

fun main() {
    val massa = Array<Int>(10, {Random.nextInt(-900, 900)})
    var kolvo = 0
    for (number in massa) {
        if (number % 2 == 0) {
            kolvo++
        }
    }

    println("\n\nНачальный массив: ${massa.joinToString(", ")}")
    println("\nСумма четных чисел массива: $kolvo")
}