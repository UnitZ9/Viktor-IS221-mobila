import kotlin.random.Random

fun main() {
    val massa1 = Array<Int>(10, { Random.nextInt(-100, 100) })
    val massa2 = Array<Int>(10, { Random.nextInt(-100, 100) })
    val massa3 = Array<Int>(10, { Random.nextInt(-100, 100) })
    val massa4 = Array<Int>(10, { Random.nextInt(-100, 100) })
    val massa5 = Array<Int>(10, { Random.nextInt(-100, 100) })
    println("Первый массив:\n${massa1.joinToString(", ")}")
    println("Второй массив:\n${massa2.joinToString(", ")}")
    println("Третий массив:\n${massa2.joinToString(", ")}")
    println("Четвертый массив:\n${massa2.joinToString(", ")}")
    println("Пятый массив:\n${massa2.joinToString(", ")}")


    fun mergeArrays(vararg arrays: Array<Int>): Array<Int> {
        return arrays.flatMap { it.toList() }.toTypedArray()
    }
    val massaIzMass = mergeArrays(massa1, massa2, massa3, massa4)
    println("\nОбъединенный массив:\n${massaIzMass.joinToString(", ")}")
}