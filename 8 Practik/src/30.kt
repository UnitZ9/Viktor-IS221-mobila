fun summaOt1DoN(n: Int): Int {
    return (n * (n + 1)) / 2
}

fun main() {
    print("Введите значение N:")
    val N = readLine()?.toIntOrNull()

    if (N != null) {
            val summa = summaOt1DoN(N)
            println("Сумма всех чисел от 1 до $N: $summa")
    }
    else {
        println("Неверный ввод. Введите целое число.")
    }
}