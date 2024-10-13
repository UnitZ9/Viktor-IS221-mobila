import javax.script.ScriptEngineManager

fun equation(equation: String): Any? {
    val engine = ScriptEngineManager().getEngineByName("JavaScript")
    return engine.eval(equation)
}

fun main() {
    // Примеры использования функции
    println(equation("1+1"))       // ➞ 2
    println(equation("7*4-2"))     // ➞ 26
    println(equation("10/2 + 5"))  // ➞ 10
    println(equation("3*(4+5)"))   // ➞ 27
}
