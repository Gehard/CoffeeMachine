fun printColor(myImage: BufferedImage) = readLine()!!.split(' ').map { it.toInt() }
    .let { (x, y) -> Color(myImage.getRGB(x, y), true) }.run { print("$red $green $blue $alpha") }
