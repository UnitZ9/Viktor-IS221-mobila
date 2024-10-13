import kotlin.random.Random

fun main() {
    val numberToGuess = Random.nextInt(1, 1001) // Загадываем число от 1 до 1000
    var guessed = false

    println("Было загадано число от 1 до 1000. Попробуйте его угадать.")

    while (!guessed) {
        println("Введите число, которое как вы считаете было загадано:")
        val input = readLine()
        // Проверяем, что пустой ли ввод и можно преобразовать ли его в число
        if (input != null && input.toIntOrNull() != null) {
            val guessedNumber = input.toInt()

            when {
                guessedNumber < numberToGuess -> {
                    println("Загаданное число будет побольше, попытайтесь еще раз.")
                }
                guessedNumber > numberToGuess -> {
                    println("Загаданное число будет поменьше, попытайтесь еще раз.")
                }
                else -> {
                    println("Ура! Вы угадали! Если вам интересно, то было загадано число: $numberToGuess.")
                    guessed = true
                }
            }
        } else {
            println("Вводить можно только целые числа.")
        }
    }
}