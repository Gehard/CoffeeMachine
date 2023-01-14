import java.awt.Color
import java.awt.image.BufferedImage

const val H2 = 200
const val F0 = 50
const val F1 = 51
const val F2 = 52

fun drawStrings(): BufferedImage {
    val image = BufferedImage(H2, H2, BufferedImage.TYPE_INT_RGB)
    val str = "Hello, images!"
    val gr = image.createGraphics()
    gr.color = Color.RED
    gr.drawString(str, F0, F0)
    gr.color = Color.GREEN
    gr.drawString(str, F1, F1)
    gr.color = Color.BLUE
    gr.drawString(str, F2, F2)
    return image
}
