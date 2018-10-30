import java.util.Scanner;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
/**
 * GeometryCalculator tests the Geometry clas
 * 
 * @author (Shiven Gupta)
 */
public class GeometryCalculator
{
    public static void main(String[] args) {
      //Created new scanner
      Scanner x = new Scanner(System.in);
      //Allows user to input values
      System.out.println("Enter Radius: ");
      double radius = x.nextDouble();
      System.out.println("Enter Height: ");
      double height = x.nextDouble();
      System.out.println("Enter the X value of point 1: ");
      double x1 = x.nextDouble();
      System.out.println("Enter the Y value of point 1: ");
      double y1 = x.nextDouble();
      System.out.println("Enter the X value of point 2: ");
      double x2 = x.nextDouble();
      System.out.println("Enter the Y value of point 2: ");
      double y2 = x.nextDouble();
      System.out.println("Enter the width of the ellipse: ");
      double ellipseWidth = x.nextDouble();
      System.out.println("Enter the height of the ellipse: ");
      double ellipseHeight = x.nextDouble();
      System.out.println("Enter the width of the rectangle: ");
      int rectWidth = x.nextInt();
      System.out.println("Enter the height of the rectangle: ");
      int rectHeight = x.nextInt();
      
      Point2D.Double point1 = new Point2D.Double(x1, y1);
      Point2D.Double point2 = new Point2D.Double(x2, y2);
      Ellipse2D.Double ell = new Ellipse2D.Double(0, 0, ellipseWidth, ellipseHeight);
      Rectangle rec = new Rectangle(0, 0, rectWidth, rectHeight);
      //Prints volumes and surface areas
      System.out.println("\nThe Volume of the Sphere is: " + Geometry.sphereVolume(radius));
      System.out.println("The Surface Area of the Sphere is: " + Geometry.sphereSurface(radius));
      System.out.println("\nThe Volume of the Cylinder is: " + Geometry.cylinderVolume(radius, height));
      System.out.println("The Surface Area of the Cylinder is: " + Geometry.cylinderSurface(radius, height));
      System.out.println("\nThe Volume of the Cone is: " + Geometry.coneVolume(radius, height));
      System.out.println("The Surface Area of the Cone is: " + Geometry.coneSurface(radius, height));
      System.out.println("\nThe Slope of the Line is: " + Geometry.getSlope(point1, point2));
      System.out.println("The Angle between the two points and the x-axis is: " + Geometry.getAngle(point1, point2));
      System.out.println("\nThe Area of the Ellipse is: " + Geometry.getEllipseArea(ell));
      System.out.println("The Area of the Rectangle is: " + Geometry.getRectangleArea(rec));
      
   }
}

