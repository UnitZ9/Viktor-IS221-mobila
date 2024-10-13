fun Delitca(chislo: Int): Boolean {
    return chislo % 100 == 0
}

fun main() {
    print("Введите целое число: ")
    val chislo = readLine()!!.toInt()
    val otvet = Delitca(chislo)
    println("Число $chislo делится на 100: $otvet")
}
