fun main() {

    println("Введите первое число: ")
    val n = readLine()!!.toDouble()
    println("Введите второе число: ")
    val m = readLine()!!.toDouble()
    println("Выберите операцию (+, -, *, /): ")
    val znak = readLine()!!

    val otvet = when (znak) {
        "+" -> n+m
        "-" -> n-m
        "*" -> n*m
        "/" -> if (m != 0.0) n/m else "Делить на ноль нельзя"
        else -> "Неверно введена операция"
    }
    println("\nОтвет: $otvet")
}