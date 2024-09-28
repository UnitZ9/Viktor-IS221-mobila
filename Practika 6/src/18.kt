import kotlin.random.Random

fun main(){
    var massa = Array<Int>(25, { Random.nextInt(-50, 50)})
    println("\nИсходный массив:\n${massa.joinToString(", ")}\n")

    for (m in 0 until massa.size){
        if ((m+1) % 5 == 0) println("${massa[m]} ")
        else print("${massa[m]}\t")
    }
}
