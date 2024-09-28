import kotlin.random.Random

fun main() {
    val massa = Array<Int>(10000, {Random.nextInt(-900, 900)})
    val copiya = massa.copyOf()

    println("\n\nИсходный массив: ${massa.joinToString(", ")}")
    println("\nКопия исходника: ${copiya.joinToString(", ")}")
}