fun main() {
    val number = readln()
    println(number.filterNot { it.isLetter() })
}