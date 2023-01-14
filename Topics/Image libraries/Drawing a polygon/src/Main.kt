import java.awt.Color
import java.awt.image.BufferedImage

private const val IMAGE_SIDE = 300
private const val X1 = 50
private const val X2 = 100
private const val X3 = 200
private const val X4 = 250
private const val Y1 = 150
private const val ANGLES_IN_HEXAGON = 6

fun drawPolygon(): BufferedImage {
    val image = BufferedImage(
        IMAGE_SIDE,
        IMAGE_SIDE,
        BufferedImage.TYPE_INT_RGB
    )

    val graphics = image.createGraphics()
    graphics.color = Color.YELLOW

    graphics.drawPolygon(
        intArrayOf(X1, X2, X3, X4, X3, X2),
        intArrayOf(Y1, X4, X4, Y1, X1, X1),
        ANGLES_IN_HEXAGON
    )

    return image
}