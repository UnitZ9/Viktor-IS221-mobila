fun summaChek(pervoe: Int, vtoroe: Int): Boolean {
    return pervoe + vtoroe < 100
}

fun main() {
    println(summaChek(35, 65))  // False
    println(summaChek(35, 16)) // True
}