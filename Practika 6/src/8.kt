import kotlin.random.Random

fun main() {
    val massa = Array<Int>(10000, {Random.nextInt(-900, 900)})
    println("У нас имеется рандомно сгенерированный массив состоящий из 10000 элементов.")
    println("Введите элемент который вы хотите попробовать найти в массиве: ")
    val num:Int = readln().toInt()

    val index = massa.indexOf(num)

    if (index != -1) {
        println("Элемент $num найден в массиве на индексе $index")
    } else {
        println("Элемент $num не найден в массиве")
    }
}
