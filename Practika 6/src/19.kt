import kotlin.random.Random

fun main() {
    val massa1 = IntArray(10) {Random.nextInt(-100,100)}
    print("Начальный массив №1: ${massa1.joinToString(", ")}")
    val massa2 = IntArray(10) {Random.nextInt(-100,100)}
    print("\nНачальный массив №2: ${massa2.joinToString(", ")}")
    massa1.sort()
    println("\n\nОтсортированный массив №1: ${massa1.joinToString()}")
    massa2.sort()
    println("Отсортированный массив №2: ${massa2.joinToString()}")
    val massaIzDvuh = massa1 + massa2
    print("\nИтоговый массив: ${massaIzDvuh.joinToString(", ")}\n")
}