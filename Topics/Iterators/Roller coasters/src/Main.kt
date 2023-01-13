const val MIN = 145
const val MAX = 210

fun checkHeight(iterator: Iterator<Int>) {
    iterator.forEach { if (it in MIN..MAX) println("You can go!") else println("Sorry, not today") }
}

fun main() {
    val list = readln().split(" ").map(Integer::parseInt).toList()
    checkHeight(list.iterator())
}