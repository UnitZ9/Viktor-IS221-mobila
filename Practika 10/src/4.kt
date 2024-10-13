fun fizzllBuzzll(n: Int): List<Any> {
    val otvet = mutableListOf<Any>()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            otvet.add("ВизллБизлл")
        } else if (i % 3 == 0) {
            otvet.add("Физллл")
        } else if (i % 5 == 0) {
            otvet.add("Бизлллл")
        } else {
            otvet.add(i)
        }
    }
    return otvet
}

fun main() {
    print("Введите натуральное число n: ")
    val n = readLine()!!.toInt()
    val otvet = fizzllBuzzll(n)
    println("Полученный список: $otvet")
}