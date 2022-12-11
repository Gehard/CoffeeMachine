import kotlin.math.abs
fun main() {
    val x = abs(readLine()!!.toInt())
    val y = abs(readLine()!!.toInt())
    val z = abs(readLine()!!.toInt())
    
    val s = 2
    
    println((x + s - 1) / s + (y + s - 1) / s + (z + s - 1) / s)
    
}
