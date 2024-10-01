fun main() {

    println("Введите количество побед: ")
    var pobedi:Int = readln().toInt()
    println("Введите количество ничейных игр: ")
    var nichya:Int = readln().toInt()
    println("Введите количество поражений: ")
    var protgrish:Int = readln().toInt()

    var balli:Int = 0.toInt()
    balli += pobedi*3
    balli += nichya
    println("\nПри $pobedi побед, $nichya ничейных игр, $protgrish поражений\nКоманда заработает: $balli баллов")
}