import kotlin.random.Random

fun main() {
    val massa = IntArray(10) { Random.nextInt(-100, 100) }
    print("Начальный массив: ${massa.joinToString(", ")}")
    val massan = massa.toMutableList()

    println("\nВведите элемент массива который хотите найти: ")
    val x:Int = readln().trim().toInt()
    val y = linearSearch(massa, x)

    if (y) {
        println("Элемент $x найден в массиве.")
    } else {
        println("Элемент $x не найден в массиве.")
    }
}

fun linearSearch(array: IntArray, element: Int): Boolean {
    for (item in array) {
        if (item == element) {
            return true //найден
        }
    }
    return false // не найден
}