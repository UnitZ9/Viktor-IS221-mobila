import kotlin.random.Random

fun main() {
    val massa = Array<Int>(20, { Random.nextInt(1, 100) })
    print("Массив:\n${massa.joinToString(", ")}")
}