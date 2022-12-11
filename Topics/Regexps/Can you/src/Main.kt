fun main() {
    val answer = readln()
    // write your code here
    println(Regex("I can('t)? do my homework on time!").matches(answer))
}