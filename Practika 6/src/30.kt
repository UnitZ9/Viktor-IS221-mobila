import kotlin.random.Random

fun main() {
    val massa = IntArray(100) { Random.nextInt(-100, 100) }

    val groups = massa.toList().chunked(10)
    for ((index, group) in groups.withIndex()) {
        println("Группа ${index + 1}: ${group.joinToString(", ")}")
    }
}