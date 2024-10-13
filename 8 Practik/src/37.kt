fun TablicaUmnozenia(chislo: Int) {
    for (i in 1..10) {
        println("$chislo * $i = ${chislo * i}")
    }
}

fun main() {
    print("Введите число: ")
    val chislo = readLine()!!.toInt()
    println("Таблица умножения от 1 до 10 для числа $chislo: ")
    TablicaUmnozenia(chislo)
}