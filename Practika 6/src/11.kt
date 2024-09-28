import kotlin.random.Random

fun main() {
    val massa1 = Array<Int>(10, { Random.nextInt(-50, 50)}) // не будем брать большие, ибо шанс пересечения будет небольшим
    val massa2 = Array<Int>(10, { Random.nextInt(-50, 50)})

    val peresech = massa1.intersect(massa2.toSet()).toList()

    println("Первый массив: \n${massa1.joinToString(", ")}")
    println("Второй масиив: \n${massa2.joinToString(", ")}")

    println("\nПересечение массивов: $peresech")
}
