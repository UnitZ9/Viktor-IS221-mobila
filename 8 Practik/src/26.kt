import java.util.Scanner

fun LastOfMassa(numbers: IntArray, razmer:Int): Int {
    var poslednee = numbers[razmer-1]
    return poslednee
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите количество элементов массива: ")
    val razmer = readLine()!!.toInt()
    val massa = IntArray(razmer)

    println("Введите элементы массива через пробел: ")
    for (i in 0 until razmer) {
        massa[i] = scanner.nextInt()
    }
    val lastofMassa = LastOfMassa(massa, razmer)
    println("Последний элемент массива: $lastofMassa")
}
