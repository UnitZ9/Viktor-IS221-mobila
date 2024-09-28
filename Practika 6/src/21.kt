import kotlin.random.Random

fun main() {
    val massa = IntArray(10) { Random.nextInt(-100, 100) }
    print("Начальный массив: ${massa.joinToString(", ")}")
    val massan = massa.toMutableList()

    println("\nВведите номер элемента массива который хотите удалить: ")
    val x:Int = readln().trim().toInt()
    massan.removeAt(x)
    val massan2 = massan.toTypedArray()
    print("Полученный массив: ${massan2.joinToString(", ")}")
}
