import kotlin.random.Random

const val MIN = 20
const val MAX = 31
const val FROM = 1
const val TO = 7

fun generateTemperature(seed: Int): String {
    val ran = Random(seed)
    val temperature = (FROM..TO).map { ran.nextInt(MIN, MAX) }

    return temperature.joinToString(" ")
}
