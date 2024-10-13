fun sumOfNaturalNumbers(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    print("Введите значение N: ")
    val N =readLine()!!.toInt()
    val otvet = sumOfNaturalNumbers(N)
    println("Сумма первых N=$N натуральных чисел равна $otvet.")
}