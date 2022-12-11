import kotlin.math.absoluteValue

fun main() {
    val n = readLine()!!.toInt().absoluteValue
    val k = readLine()!!.toInt().absoluteValue

    if (n < 10_000 && k < 10_000) {
        println(k % n)
    }
}