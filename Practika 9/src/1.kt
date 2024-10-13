import kotlin.random.Random

fun main() {
    repeat(10) {
        print("${Random.nextInt(1, 101)}, ")
    }
}