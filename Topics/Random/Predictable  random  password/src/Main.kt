import kotlin.random.Random

const val MIN = 33
const val MAX = 127
const val FROM = 1
const val TO = 10

fun generatePredictablePassword(seed: Int): String {
    val ran = Random(seed)
    val randomPassword = (FROM..TO).map { ran.nextInt(MIN, MAX).toChar() }

    return randomPassword.joinToString("")
}
