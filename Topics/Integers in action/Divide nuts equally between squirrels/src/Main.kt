fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    
    if (n < 10_001 && k < 10_001) {
        val result = k / n
        println(result)
    }
    
}
