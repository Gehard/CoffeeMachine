import kotlin.random.Random

fun createDiceGameRandomizer(n: Int): Int {
    var sum = 0
    val seed = Random(7)
    for (i in 0..n) {
        sum += seed.nextInt(1, 7)
    }
    return sum
}