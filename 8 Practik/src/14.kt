fun summaChisel(chislo1: Int, chislo2: Int): Int {
    return chislo1 + chislo2
}

fun main() {
    print("Введите первое число: ")
    val chislo1 = readLine()?.toIntOrNull()

    print("Введите второе число: ")
    val chislo2 = readLine()?.toIntOrNull()

    if (chislo1 != null && chislo2 != null) {
        val summa = summaChisel(chislo1, chislo2)
        println("Сумма $chislo1 и $chislo2 равна $summa")
    } else {
        println("Проверьте корректность ввода.")
    }
}
