
/**
 * Cone calculates the volume and surface area of a cone.
 * 
 * @author (Shiven Gupta) 
 */
public class Cone
{
    //Instance variables
    private double radius;
    private double height;
    /**
     * Initializes the instance variables
     * @param r the radius of the cone
     * @param h the height of the cone
     * (Precondition: r >= 0)
     * (Precondition: h >= 0)
     */
    public Cone(double r, double h) {
        radius = r;
        height = h;
    }
    /**
     * Computes the volume of the cone
     * @return volume of the cone
     * (Postcondition: The volume is greater than 0)
     */
    public double getVolume() {
        double vol = Math.pow(radius, 2) * Math.PI * (height / 3.0);
        return vol;
    }
    /**
     * Computes the surface area of the cone
     * @return surface area of the cone
     * (Postcondition: The surface area is greater than 0)
     */
    public double getSurfaceArea() {
        double surf = Math.PI * radius * (radius + Math.sqrt((height*height) + (radius*radius)));
        return surf;
    }
}
