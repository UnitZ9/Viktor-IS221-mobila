fun chisla(znach_k: Int, znach_n: Int): Boolean {
    return Math.pow(znach_k.toDouble(), znach_k.toDouble()).toInt() == znach_n
}

fun main() {
    print("Введите значение k: ")
    val znach_k = readLine()!!.toInt()
    print("Введите значение n: ")
    val znach_n = readLine()!!.toInt()
    val otvet = chisla(znach_k, znach_n)
    println(otvet)
}