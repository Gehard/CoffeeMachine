import kotlin.random.Random
const val ONE = 1
const val SEVEN = 7

fun throwD6(): Int {
    return Random.nextInt(ONE, SEVEN)
}
