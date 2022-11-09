package machine

fun main() {
    println("Write how many ml of water the coffee machine has:")
    val water = readln().toInt()

    println("Write how many ml of milk the coffee machine has:")
    val milk = readln().toInt()

    println("Write how many grams of coffee beans the coffee machine has:")
    val coffeeBeans = readln().toInt()

    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()

    val maxCups = minOf(water/200, milk/50, coffeeBeans/15)

    when {
        maxCups > cups -> println("Yes, I can make that amount of coffee (and even ${maxCups - cups} more than that)")
        maxCups < cups -> println("No, I can make only $maxCups cups of coffee")
        else -> println("Yes, I can make that amount of coffee")
    }

}
