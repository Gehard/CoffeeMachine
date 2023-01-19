@SuppressWarnings("MagicNumber")

fun main() {
    val set = setOf<Int>(12, 34, 235, 2343, 1, 3, 4564, 23, 5, 6, 123545, 464)
    val a = readln()
    val b = readln().toInt()

    println(if (a == "first") set.firstOrNull { it > b } else set.lastOrNull { it > b })

}