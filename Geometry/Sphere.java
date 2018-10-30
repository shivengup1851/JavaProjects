
/**
 * Sphere calculates the volume and surface area of a sphere.
 * @author (Shiven Gupta) 
 */
public class Sphere
{
    //Instance variables
    private double radius;
    /**
     * Initializes the instance variables
     * @param r the radius of the sphere
     * (Precondition: r >= 0)
     */
    public Sphere(double r) {
        radius = r;
    }
    /**
     * Computes the volume of the sphere
     * @return volume of the sphere
     * (Postcondition: The volume is greater than 0)
     */
    public double getVolume() {
        double vol = Math.pow(radius, 3) * Math.PI * (4.0 / 3.0);
        return vol;
    }
    /**
     * Computes the surface area of the sphere
     * @return surface area of the sphere
     * (Postcondition: The surface area is greater than 0)
     */
    public double getSurfaceArea() {
        double surf = Math.pow(radius, 2) * Math.PI * 4;
        return surf;
    }
}
