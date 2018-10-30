import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
/**
     * Write a description of class CheckerBoard here.
     *
     * @author (Shiven Gupta)
     */
    public class CheckerBoard
    {
    //Created my instance variables
    private int numSquares;
    private int size;
    /**
     * Creates the object and initializes my instance variables
     * @param squareCount number of squares in rows and columns
     * @param squareSize the size of the squares
     */
    public CheckerBoard (int squareCount, int squareSize) {
        numSquares = squareCount;
        size = squareSize;
    }
    /**
     * Draws the squares
     * @param g2 the Graphics2D variable
     */
    public void draw (Graphics2D g2) {
        //Created a gold color
        Color gold = new Color(218,165,32);
        //Draws the checkerboard with rows and columns of alternating-colored squares
        for (int y = 0; y < numSquares; y++){
            for (int x = 0; x < numSquares; x++){
                //Created a square
                Rectangle square = new Rectangle(size * y, size * x, size, size);
                //Alternates the colors of the squares
                if ((y % 2 == 0 && x % 2 == 1 || y % 2 == 1 && x % 2 == 0))
                        g2.setColor(gold);
                    else
                        g2.setColor(Color.GREEN);
                //Draws the squares
                g2.fill(square);
                }
            }
        }
    }   