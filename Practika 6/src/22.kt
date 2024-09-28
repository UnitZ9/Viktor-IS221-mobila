import kotlin.random.Random

fun main() {
    val massa = IntArray(10) { Random.nextInt(-100, 100) }
    print("\nНачальный массив: ${massa.joinToString(", ")}")
    val massa1 = massa
    massa1.sort()
    println("\nВторой по величине элемент в массиве: ${massa1[(massa1.size)-2]}")
}
