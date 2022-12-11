fun main() {
    val duration = readLine()!!.toInt()
    val food = readLine()!!.toInt()
    val flight = readLine()!!.toInt()
    val night = readLine()!!.toInt()
    
    val total = duration * food + flight * 2 + (duration - 1) * night
    println(total)
    
}
