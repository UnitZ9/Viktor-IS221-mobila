fun CelsiusToFahrenheit(vvod: Double): Double {
    return (vvod * 9/5) + 32
}

fun main() {
    println("Введите температуру в Цельсии:")
    val vvod = readLine()?.toDoubleOrNull()

    if (vvod != null) {
        val fahrenheit = CelsiusToFahrenheit(vvod)
        println("Температура в Фаренгейте: $fahrenheit")
    } else {
        println("Неверный ввод. Введите числовое значение.")
    }
}
