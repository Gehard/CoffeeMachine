fun main() {
    val (h1, m1, s1) = Array(3) { readLine()!!.toInt() }
    val (h2, m2, s2) = Array(3) { readLine()!!.toInt() }
    println(h2 * 60 * 60 + m2 * 60 + s2 - (h1 * 60 * 60 + m1 * 60 + s1))
}
