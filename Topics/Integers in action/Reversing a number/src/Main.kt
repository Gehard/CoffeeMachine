fun main() {
    val digit = readLine()!!.toInt()
    if (digit in 100..999){
        val newNumber = digit.toString().reversed()
        println(newNumber.toInt())
    }
}