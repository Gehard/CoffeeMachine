import kotlin.math.absoluteValue

fun main() {
    val input = readLine()!!.toInt().absoluteValue
    if (input in 100..999) {

        println(input / 100 + input % 100 / 10 + input % 10)
    }

}