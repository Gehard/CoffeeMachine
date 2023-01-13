fun main() {
    val words = mutableListOf(readln(), readln())
    words.sortBy { it.length }

    val first = words.first().iterator()
    val second = words.last().iterator()

    while (first.hasNext()) print("${first.next()}${second.next()}")
    while (second.hasNext()) print(second.next())
}