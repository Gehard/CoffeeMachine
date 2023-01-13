import java.util.Collections
fun main() {
    val list = readln().split(" ")
    val sets = list.toSet()
    for (i in sets) {
        println("$i ${Collections.frequency(list, i)}")
    }

}
