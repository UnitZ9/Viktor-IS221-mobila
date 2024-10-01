fun main() {
    println("Введите первое число: ")
    var pervoe:Int = readln().toInt()
    println("Введите второе число: ")
    var vtoroe:Int = readln().toInt()

    var otvet:Boolean
   if (pervoe == vtoroe) {
       otvet = true
   }
    else otvet = false
    println("\nЧисла равны? Ответ: $otvet")
}
