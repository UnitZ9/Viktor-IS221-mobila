import kotlin.random.Random

fun main() {
    val massa = Array<Int>(5, { Random.nextInt(-50, 50) })
    print("Массив:\n${massa.joinToString(", ")}")
    var x = 0
    var y = 1
    for (m in massa) {
        x += m
        y *= m
    }
    println("\nСумма всех чисел массива: $x \nПроизведение всех чисел массива: $y")


}