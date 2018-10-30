
import java.awt.Rectangle;

public class AreaTester {
    public static void main (String[] args) {
        Rectangle box = new Rectangle (5,10,20,30);
        System.out.println("The x-value of my rectangle is " + box.getX());
        System.out.println("The expected x-value of my rectangle is 5.0");
        System.out.println("The y-value of my rectangle is " + box.getY());
        System.out.println("The expected y of my rectangle is 10.0");
        System.out.println("The width of my rectangle is " + box.getWidth());
        System.out.println("The expected width of my rectangle is 20.0");
        System.out.println("The height of my rectangle is " + box.getHeight());
        System.out.println("The expected height of my rectangle is 30.0 sq units");
        System.out.println("The area of my rectangle is " + (box.getWidth()* box.getHeight()) + 
        " sq units");
        System.out.println("The expected area of my rectangle is 600.0");
        System.out.println(box);
        box.translate(17, 22);
        System.out.println("The x-value of my rectangle is " + box.getX());
        System.out.println("The expected x-value of my rectangle is 22.0");
        System.out.println("The y-value of my rectangle is " + box.getY());
        System.out.println("The expected y-value of my rectangle is 32.0");
        System.out.println("The width of my rectangle is " + box.getWidth());
        System.out.println("The expected width of my rectangle is 20.0");
        System.out.println("The height of my rectangle is " + box.getHeight());
        System.out.println("The expected height of my rectangle is 30.0 sq units");
        System.out.println("The area of my rectangle is " + (box.getWidth()* box.getHeight()) + 
        " sq units");
        System.out.println("The expected area of my rectangle is 600.0");
        System.out.println(box);
    }
}
