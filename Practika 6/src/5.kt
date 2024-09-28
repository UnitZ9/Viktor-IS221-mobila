import kotlin.random.Random
fun filter(input:Array<String>):List<String>{
    return input.filter {it.all {char -> char.isLetter()}}
}

fun main() {
    val nums = arrayOf("253", "3", "235626", "8235", "124", "f", "345", "54", "sus", "suuuuuuu", "ss")
    print("Начальный массив: ")
    for (num in nums) {
        print("$num, ")
    }
    println("\n\nТолько ''особые'': ")
    val words = filter(nums)
    println("$words")
}