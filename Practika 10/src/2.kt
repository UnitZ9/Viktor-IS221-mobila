fun generatePyramid(N: Int) {
    if (N > 0) {
        for (i in 1..N) {
            val probel = " ".repeat((N - i))
            val shtrih = "#".repeat(2 * i - 1)
            println("$probel$shtrih$probel")
        }
    } else {
        println("N должно быть положительным числом.")
    }
}

fun main() {
    print("Введите натуральное число N: ")
    val N = readLine()!!.toInt()
    generatePyramid(N)
}