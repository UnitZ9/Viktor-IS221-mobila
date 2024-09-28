import kotlin.random.Random

fun main() {
    val massa1 = Array<Int>(10, { Random.nextInt(-100, 100) })
    val massa2 = Array<Int>(10, { Random.nextInt(-100, 100) })
    println("Первый массив:\n${massa1.joinToString(", ")}")
    println("Второй массив:\n${massa2.joinToString(", ")}")

    val massaIzDvuh = massa1 + massa2
    println("\nОбъединенный массив:\n${massaIzDvuh.joinToString(", ")}")
}