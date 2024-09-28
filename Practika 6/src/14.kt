import kotlin.random.Random

fun main() {
    val massa = Array<Int>(10, { Random.nextInt(-100, 100) })
    print("Массив:\n${massa.joinToString(", ")}")

    println("\nЧисла, делящиеся на 3: ")
    for (num in massa) {
        if (num % 3 == 0) {
            print("$num, ")
        }
    }
}