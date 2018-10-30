import java.util.Scanner;
/**
 * GeometryCalculator tests the Geometry classes
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
      System.out.println("\nEnter Height: ");
      double height = x.nextDouble();
      //Created new objects
      Sphere sph = new Sphere(radius);
      Cylinder cyl = new Cylinder(radius, height);
      Cone con = new Cone(radius, height);
      //Prints volumes and surface areas
      System.out.println("The Volume of the Sphere is: " + sph.getVolume());
      System.out.println("The Surface Area of the Sphere is: " + sph.getSurfaceArea());
      System.out.println("The Volume of the Cylinder is: " + cyl.getVolume());
      System.out.println("The Surface Area of the Cylinder is: " + cyl.getSurfaceArea());
      System.out.println("The Volume of the Cone is: " + con.getVolume());
      System.out.println("The Surface Area of the Cone is: " + con.getSurfaceArea());
   }
}
