class LewisCarrollBook {
    var name = ""
        set(name) {
            field = name
            println("Now, a book called $field")
        }
        get() {
            println("The name of the book is $field")
            return field
        }

    var author = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }

    var price = 0
        set(price) {
            println("Putting a new price...")
            field = price
            println("The new price is $price")
        }
}