val fruits = mapOf<String, String> ("Apple" to "Green", "Banana" to "Yellow", "Strawberry" to "Red")
val map = buildMap<String, String> {
    putAll(fruits)
}