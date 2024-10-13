fun summa(chisla: List<Int>): Int {
    return chisla.sum()
}

fun main() {
    println("Введите числа через пробел:")
    val vvod = readLine()
    if (vvod != null) {
        val chisla = vvod.split(" ").mapNotNull { it.toIntOrNull() }

        val summaChisel = summa(chisla)
        println("Сумма элементов списка: $summaChisel")
    } else {
        println("Вы ввели список который не поддерживается / в неправильном формате.")
    }
}