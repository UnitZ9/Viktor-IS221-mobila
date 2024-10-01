fun main() {
    println("Введите список чисел, разделенных запятой:")
    val chisla = readLine() ?: return

    // Преобразуем строку в список чисел
    val minchislo = chisla.split(",").mapNotNull { it.trim().toIntOrNull() }

    if (minchislo.isEmpty()) {
        println("Есть небольшая ошибка в веденном списке чисел, проверьте и напишите все еще раз")
    } else {
        println("Самое маленькое число из списка: ${minchislo.minOrNull()}")
    }
}
