import kotlin.math.absoluteValue

fun main() {
    val x = readLine()!!.toInt().absoluteValue
    println(x % 100 / 10)
}