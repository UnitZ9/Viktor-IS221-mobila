fun raznicaMinMax(chisla: List<Int>): Int? {
    if (chisla.isEmpty()) return null
    val max = chisla.maxOrNull() ?: return null
    val min = chisla.minOrNull() ?: return null
    return max - min
}

fun main() {
    println("Введите целые числа через пробел:")
    val vvod = readLine()
    if (vvod != null) {
        val chisla = vvod.split(" ").mapNotNull { it.toIntOrNull() }

        val raznica = raznicaMinMax(chisla)

        if (raznica != null) {
            println("Разность между самым большим и самым маленьким числом: $raznica")
        } else {
            println("Не удалось вычислить разность, проверьте введенные вами данные.")
        }
    } else {
        println("Вы ввели список который не поддерживается / в неправильном формате.")
    }
}