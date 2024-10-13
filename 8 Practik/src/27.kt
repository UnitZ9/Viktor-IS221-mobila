import kotlin.random.Random

fun containsElement(array: IntArray, element: Int): Boolean {
    return array.contains(element)
}

fun main() {
    print("Введите размер массива: ")
    val arraySize = readLine()!!.toInt()
    val minValue = 1
    val maxValue = 200
    val massa = IntArray(arraySize) { Random.nextInt(minValue, maxValue + 1) }
    println("Сгенерированный массив: ${massa.joinToString(", ")}")

    println("Введите элемент для проверки:")
    val vvod = readLine()?.toIntOrNull()

    if (vvod != null) {
        val isPresent = containsElement(massa, vvod)
        if (isPresent) {
            println("Элемент $vvod присутствует в массиве.")
        } else {
            println("Элемент $vvod отсутствует в массиве.")
        }
    } else {
        println("Проверьте правильность введенных данных")
    }
}
