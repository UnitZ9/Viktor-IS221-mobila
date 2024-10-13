fun proverka(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    println(proverka(0.1, 1000.0, 50.0))  // True
    println(proverka(0.05, 2000.0, 100.0)) // False
}


/*

fun isWorthIt(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    val reader = java.util.Scanner(System.`in`)
    print("Введите значение prob: ")
    val prob = reader.nextDouble()
    print("Введите prize: ")
    val prize = reader.nextDouble()
    print("Введите pay: ")
    val pay = reader.nextDouble()

    val result = isWorthIt(prob, prize, pay)
    if (result) {
        println("\n$result")
    } else {
        println("\n$result")
    }
}
*/