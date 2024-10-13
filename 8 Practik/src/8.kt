fun calculateFrames(minutes: Int, fps: Int): Int {
    val secondsInMinute = 60
    return minutes * secondsInMinute * fps
}

fun main() {
    print("Введите количество минут: ")
    val minutes = readLine()!!.toInt()
    print("Введите значение FPS: ")
    val fps = readLine()!!.toInt()
    val frames = calculateFrames(minutes, fps)
    println("За $minutes минут при FPS $fps будет показано $frames кадров.")
}
