import kotlin.random.Random

fun main() {
    val massa = Array<Int>(10, {Random.nextInt(-900, 900)})

    val reversedmassa = massa.reversedArray()
    println("Исходный массив: ${massa.joinToString(", ")}")
    println("Реверсированный массив: ${reversedmassa.joinToString(", ")}")
}