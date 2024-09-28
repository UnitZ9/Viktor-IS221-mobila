fun main() {
    var massa = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    var x:Int = 0
    for (a in 0..massa.size/2 - 1){
        if (massa[a] == massa[(massa.size - 1) - a]) x++
    }
    if (x == massa.size/2) println("Массив является палиндромом")
    else println("Массив не палиндром")
}

/*
Вариант с рандомным массивом

import kotlin.random.Random

fun main() {
    var massa = Array<Int>(10, { Random.nextInt(-100, 100) })
    var x:Int = 0
    for (a in 0..massa.size/2 - 1){
        if (massa[a] == massa[(massa.size - 1) - a]) x++
    }
    if (x == massa.size/2) println("Массив является палиндромом")
    else println("Массив не палиндром")
}


 */