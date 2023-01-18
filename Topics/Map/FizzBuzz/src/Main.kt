const val THREE = 3
const val FIVE = 5
fun iterator(map: Map<String, Int>) = map.values.forEach {
    println(if (it % THREE == 0) "Fizz" else if (it % FIVE == 0) "Buzz" else "FizzBuzz")
}