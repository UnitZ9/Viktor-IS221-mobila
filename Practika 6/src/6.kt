import kotlin.random.Random

fun main() {
    val massa = Array<Int>(10, {Random.nextInt(-900, 900)})
    val chetnie = mutableListOf<Int>()
    val nechetnie = mutableListOf<Int>()
    for (number in massa) {
        if (number % 2 == 0) {
            chetnie.add(number)
        } else {
            nechetnie.add(number)
        }
    }
    //делаем обратно в массивы
    val chetniemassa = chetnie.toTypedArray()
    val nechetniemassa = nechetnie.toTypedArray()

    println("Начальный массив: ${massa.joinToString(", ")}")
    println("Массив четных чисел: ${chetniemassa.joinToString(", ")}")
    println("Массив нечетных чисел: ${nechetniemassa.joinToString(", ")}")
}