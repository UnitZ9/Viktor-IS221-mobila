import kotlin.random.Random

fun main(){
    val massa = Array<Int>(10, { Random.nextInt(-25, 25)})
    print("Начальный массив:\n${massa.joinToString(", ")}")
    print("\nВведите индекс элемента который хотите поменять: ")
    val x = readln().toInt()
    print("Введите индекс элемента на который хотите поменять выбранный элемент:")
    val y = readln().toInt()
    var vremeni = massa[x]
    massa[x] = massa[y]
    massa[y] = vremeni
    println("\nИзмененный массив ${massa.joinToString(", ")}")
}