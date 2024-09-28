fun main() {
    print("Введите длину массива: ")
    val dlina = readLine()?.toIntOrNull() ?: run {
        println("\nНекорректный ввод.")
        return
    }
    val massa = IntArray(dlina)

    for (i in massa.indices) {
        println("Введите элемент массива по индексу $i: ")
        massa[i] = readLine()?.toIntOrNull() ?: run {
            println("\nНекорректный ввод.")
            return
        }
    }
    println("\nВведённый массив: ${massa.joinToString(", ")}")
}