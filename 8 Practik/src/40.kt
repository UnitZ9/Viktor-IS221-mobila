import kotlin.random.Random

fun copyMassa(massa: IntArray): IntArray {
    val newArray = IntArray(massa.size)
    for (i in massa.indices) {
        newArray[i] = massa[i]
    }
    return newArray
}

fun main() {
    print("Введите размер массива: ")
    val arraySize = readLine()!!.toInt()
    val minValue = 1
    val maxValue = 200
    val massa = IntArray(arraySize) { Random.nextInt(minValue, maxValue + 1) }

    val copiedMassa = copyMassa(massa)
    println("Исходный массив: ${massa.contentToString()}")
    println("Скопированный массив: ${copiedMassa.contentToString()}")
}