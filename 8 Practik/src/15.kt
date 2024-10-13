fun Sravnenie(chislo1: Int, chislo2: Int): Int {
    if (chislo1 > chislo2) {
        return chislo1
    }
    else return chislo2
}

fun main() {
    print("Введите первое число: ")
    val chislo1 = readLine()?.toIntOrNull()

    print("Введите второе число: ")
    val chislo2 = readLine()?.toIntOrNull()

    if (chislo1 != null && chislo2 != null) {
        val raznica = Sravnenie(chislo1, chislo2)
        println("Большим является число: $raznica")
    } else {
        println("Проверьте корректность ввода.")
    }
}
