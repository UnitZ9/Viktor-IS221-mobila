import kotlin.random.Random

fun generatePassword(dlina: Int): String {
    val simvoli = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+"
    val parol = StringBuilder()
    for (i in 0 until dlina) {
        parol.append(simvoli[Random.nextInt(simvoli.length)])
    }
    return parol.toString()
}

fun main() {
    print("Введите желаемую длину пароля: ")
    val dlina = readLine()!!.toInt()
    val parol = generatePassword(dlina)
    println("Сгенерированный пароль: $parol")
}