import kotlin.random.Random

fun ElementPoZnacheniu(array: IntArray, index: Int): Int {
    return array[index-1]
}

fun main() {
    print("Введите размер массива: ")
    val arraySize = readLine()!!.toInt()
    val minValue = 1
    val maxValue = 200
    val randomArray = IntArray(arraySize) { Random.nextInt(minValue, maxValue + 1) }
    println("Массив: ${randomArray.joinToString(", ")}")

    print("Введите индекс массива: ")
    val index = readLine()?.toIntOrNull()

    if (index != null) {
        val otvet = ElementPoZnacheniu(randomArray, index)
        println("Под индексом: $index расположен элемент: $otvet")
    }
}
