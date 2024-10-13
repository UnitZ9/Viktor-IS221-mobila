fun NewMassa(n: Int): IntArray {
    return IntArray(n) { it + 1 }
}

fun main() {
    print("Введите значение N: ")
    val n = readLine()?.toIntOrNull() ?: 0

    val massa = NewMassa(n)
    println("Созданный массив: ${massa.joinToString(", ")}")
}
