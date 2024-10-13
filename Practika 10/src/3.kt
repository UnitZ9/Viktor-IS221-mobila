fun ShriftCezarya(tekst: String, sdvig: Int): String {
    val TekstPosleSdviga = StringBuilder()

    for (char in tekst) {
        if (char.isLetter()) {
            val base = if (char.isUpperCase()) 65 else 97 // A или a
            val shiftedChar = ((char.toInt() - base + sdvig) % 26 + base).toChar()
            TekstPosleSdviga.append(shiftedChar)
        } else {
            TekstPosleSdviga.append(char)
        }
    }
    return TekstPosleSdviga.toString()
}

fun main() {
    println("Введите текст на латинском: ")
    val tekst = readLine()!!
    print("Введите сдвиг: ")
    val sdvig = readLine()!!.toInt()

    val otvet = ShriftCezarya(tekst, sdvig)
    println("Зашифрованный текст: $otvet")
}