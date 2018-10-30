import java.awt.Rectangle;
/**
 * Write a description of class Square here.
 * 
 * @author (Shiven Gupta)
 */
public class Square extends Rectangle
{
    //Instance variables
    private int x;
    private int y;
    private int sideLength;
    /**
     * Constructor to initialize instance variables
     * @param centerX the x value of the center
     * @param centerY the y value of the center
     * @param sideLength the side length of the square
     * (Precondition: sideLength > 0)
     */
    public Square(int centerX, int centerY, int sideLength) {
        x = centerX - (sideLength / 2);
        y = centerY - (sideLength / 2);
        this.sideLength = sideLength;
        super.setLocation(x,y);
        super.setSize(sideLength, sideLength);
    }
    /**
     * Computes the area of the square
     * @return the area of the square
     */
    public int getArea() {
        return sideLength * sideLength;
    }
}
