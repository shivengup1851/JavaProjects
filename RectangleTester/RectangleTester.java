import java.awt.Rectangle;
/**
 * Write a description of class RectangleTester here.
 * 
 * @author (Shiven Gupta)
 */
public class RectangleTester
{
  public static void main (String[] args) {
      //Created object
      Rectangle box = new Rectangle(0,0,24,32);
      //Created variables that would hold different values
      double area = box.getHeight() * box.getWidth();
      double perim = box.getHeight() + box.getHeight() + box.getWidth() + box.getWidth();
      double diag = Math.sqrt(box.getHeight() * box.getHeight() + box.getWidth() * box.getWidth());
      System.out.println("Expected Area: 768");
      System.out.println("Expected Perimiter: 112");
      System.out.println("Expected Diagonal Length: 40");
      System.out.println("\nArea: " + area);
      System.out.println("Perimiter: " + perim);
      System.out.println("Diagonal Length: " + diag);
    }
}
