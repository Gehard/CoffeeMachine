import java.awt.Color
import java.awt.image.BufferedImage
const val H1 = 100
const val H3 = 300
const val H5 = 500

fun drawSquare(): BufferedImage {
    val image = BufferedImage(H5, H5, BufferedImage.TYPE_INT_RGB)
    val graph = image.createGraphics()
    graph.color = Color.RED
    graph.drawRect(H1, H1, H3, H3)
    return image
}