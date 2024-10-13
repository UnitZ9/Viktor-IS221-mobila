import kotlin.random.Random

fun findFirstIndex(massa: IntArray, element: Int): Int {
    for (i in massa.indices) {
        if (massa[i] == element) {
            return i
        }
    }
    return -1
}

fun main() {
    print("Введите размер массива: ")
    val arraySize = readLine()!!.toInt()
    val minValue = 1
    val maxValue = 200
    val massa = IntArray(arraySize) { Random.nextInt(minValue, maxValue + 1) }

    print("Введите элемент который хотите найти: ")
    val element = readLine()!!.toInt()

    val index = findFirstIndex(massa, element)

    if (index != -1) {
        println("Элемент $element найден в массиве по индексу $index")
    } else {
        println("Элемент $element не найден в массиве")
    }
}