import java.awt.Color
import java.awt.image.BufferedImage

const val SIZE = 200
const val DIAMETER = 100
const val COORD_A = 50
const val COORD_B = 75

fun drawCircles(): BufferedImage = BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB).apply {
    with(createGraphics()) {
        color = Color.red
        drawOval(COORD_A, COORD_A, DIAMETER, DIAMETER)
        color = Color.yellow
        drawOval(COORD_A, COORD_B, DIAMETER, DIAMETER)
        color = Color.green
        drawOval(COORD_B, COORD_A, DIAMETER, DIAMETER)
        color = Color.blue
        drawOval(COORD_B, COORD_B, DIAMETER, DIAMETER)
    }
}