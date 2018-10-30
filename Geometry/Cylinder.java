
/**
 * Cylinder calculates the volume and surface area of a cylinder.
 * 
 * @author (Shiven Gupta) 
 */
public class Cylinder
{
    //Instance variables
    private double radius;
    private double height;
    /**
     * Initializes the instance variables
     * @param r the radius of the cylinder
     * @param h the height of the cylinder
     * (Precondition: r >= 0)
     * (Precondition: h >= 0)
     */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
     /**
     * Computes the volume of the cylinder
     * @return volume of the cylinder
     * (Postcondition: The volume is greater than 0)
     */
    public double getVolume() {
        double vol = Math.pow(radius, 2) * Math.PI * height;
        return vol;
    }
    /**
     * Computes the surface area of the cylinder
     * @return surface area of the cylinder
     * (Postcondition: The surface area is greater than 0)
     */
    public double getSurfaceArea() {
        double surf = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return surf;
    }
}
