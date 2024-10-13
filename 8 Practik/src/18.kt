fun isPrime(chislo: Int): Boolean {
    if (chislo <= 1) return false
    if (chislo <= 3) return true
    if (chislo % 2 == 0 || chislo % 3 == 0) return false

    for (i in 5..Math.sqrt(chislo.toDouble()).toInt() step 6) {
        if (chislo % i == 0 || chislo % (i + 2) == 0) return false
    }
    return true
}

fun main() {
    print("Введите число: ")
    val chislo = readLine()?.toIntOrNull()

    if (chislo != null) {
        if (isPrime(chislo)) {
            println("$chislo является простым числом.")
        } else {
            println("$chislo не является простым числом.")
        }
    } else {
        println("Пожалуйста, введите корректное число.")
    }
}
