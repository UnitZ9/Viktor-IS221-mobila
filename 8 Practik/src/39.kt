import kotlin.random.Random

fun reverseMassa(massa: IntArray): IntArray {
    val reversedArray = IntArray(massa.size)
    for (i in massa.indices) {
        reversedArray[i] = massa[massa.size - i - 1]
    }
    return reversedArray
}

fun main() {
    print("Введите размер массива: ")
    val arraySize = readLine()!!.toInt()
    val minValue = 1
    val maxValue = 200
    val massa = IntArray(arraySize) { Random.nextInt(minValue, maxValue + 1) }
    println("Массив: ${massa.joinToString(", ")}")

    val reversedMassa = reverseMassa(massa)
    println("Перевёрнутый массив: ${reversedMassa.joinToString(", ")}")
}