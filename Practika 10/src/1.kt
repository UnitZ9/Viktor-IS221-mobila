fun generateNumbers(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    } else {
        val chisla = mutableListOf<Int>()
        for (i in n downTo 1) {
            chisla.add(i)
        }
        return chisla
    }
}

fun main() {
    print("Введите натуральное число n: ")
    val n = readLine()!!.toInt()
    val chisla = generateNumbers(n)
    println("Список чисел от $n до 1: $chisla")
}