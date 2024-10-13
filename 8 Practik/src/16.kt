fun Chotnost(chislo: Int): Boolean {
    if (chislo % 2 == 0) {
        return true
    }
    else return false
}

fun main() {
    print("Введите число: ")
    val chislo = readLine()?.toIntOrNull()

    if (chislo != null) {
        val otvet = Chotnost(chislo)
        println("Введенное число является четным: $otvet")
    } else {
        println("Проверьте корректность ввода.")
    }
}
