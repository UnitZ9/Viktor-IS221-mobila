import kotlin.random.Random

fun main() {
    val nums = IntArray(10) {Random.nextInt(1,999)}
    print("Начальный массив: ")
    for (num in nums) {
        print("$num, ")

    }
    nums.sort()
    println("\n\nОтсортированный массив: ${nums.joinToString()}")
}