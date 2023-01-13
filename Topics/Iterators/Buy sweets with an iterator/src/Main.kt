fun countSum(sweets: Map<String, Int>): Int {
    val iterator = sweets.iterator()
    var sum = 0
    iterator.forEach { (_, value) ->
        sum += value
    }
    return sum
}

fun main() {
    val cart = mutableMapOf<String, Int>()
    // write your code
    val n = readln().toInt()
    for (i in 1..n) {
        val input = readln().split(" ")
        cart[input[0]] = input[1].toInt()
    }

    println(countSum(cart)) // do not change this line
}