import kotlin.random.Random


fun main() {
    val massa = IntArray(10) { Random.nextInt(-100, 100) }
    print("Начальный массив: ${massa.joinToString(", ")}")
    var x = 0
    for (m in massa) {
        x += m
    }
    println("\nСреднее арифметическое элементов массива: ${x/massa.size}")
}