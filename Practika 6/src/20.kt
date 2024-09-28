fun main() {
    val start = 2
    val raznost = 3
    val kolvo_elementov = 10

    val massa = IntArray(kolvo_elementov) { start + it * raznost }
    println("Массив с арифмет. прогрессией: ${massa.joinToString(", ")}")
}