fun main() {
    println("Введите число N:")
    val N = readLine()!!.toInt()

    print("Простые числа до $N: ")
    for (i in 2..N) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}

fun isPrime(chislo: Int): Boolean {
    if (chislo <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(chislo.toDouble()).toInt()) {
        if (chislo % i == 0) {
            return false
        }
    }
    return true
}