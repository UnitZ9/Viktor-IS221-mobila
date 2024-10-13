fun factorialIterative(chislo: Int): Long {
    if (chislo < 0) {
        throw IllegalArgumentException("Факториал отрицательного числа не существует.")
    }
    var otvet = 1L
    for (i in 1..chislo) {
        otvet *= i
    }
    return otvet
}

fun main() {
    print("Введите число: ")
    val chislo = readLine()?.toIntOrNull()

    if (chislo != null) {
        try {
            val otvet = factorialIterative(chislo)
            println("Факториал числа $chislo равен $otvet")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    } else {
        println("Проверьте корректность ввода.")
    }
}
