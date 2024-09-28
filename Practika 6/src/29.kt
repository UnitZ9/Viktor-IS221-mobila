import kotlin.random.Random

fun main() {
    val massa = Array(10) { Random.nextInt(-100, 100) }
    println("Начальнный массив: ${massa.joinToString(", ")}")

    val median = findMedian(massa)
    println("Медиана массива: $median")
}


fun findMedian(array: Array<Int>): Double {
    // Сортируем массив
    val sortedMassiv = array.sortedArray()
    val size = sortedMassiv.size

    return if (size % 2 == 0) {
        // Если число элементов четное, медиана - среднее двух центральных элементов
        (sortedMassiv[size / 2 - 1] + sortedMassiv[size / 2]) / 2.0
    } else {
        // Если число элементов нечетное, медиана - центральный элемент
        sortedMassiv[size / 2].toDouble()
    }
}
