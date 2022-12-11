import java.time.LocalDateTime
import java.time.ZoneOffset

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val dateTime = LocalDateTime.ofEpochSecond(totalSeconds, 0, ZoneOffset.UTC)
    println("${dateTime.hour}:${dateTime.minute}:${dateTime.second}")
}