/**
 * The IceCreamCone prints the surface area and the volume of a cone
 * @author (Shiven Gupta)
 */
public class IceCreamCone {
    
    //Created my instance variables
    private double height;
    private double radius;
    
    /**
     * Initializes my instance variables
     * @param coneHeight the height of the cone
     * @param coneRadius the radius of the cone
     */
    public IceCreamCone ( double coneHeight, double coneRadius ) {
        height = coneHeight;
        radius = coneRadius;
    }
    /**
     * Gets the height of the cone
     * @return the height of the cone
     */
    public double getHeight() {
        return height;
    }
    /**
     * Gets the radius of the cone
     * @return the radius of the cone
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Gets the surface area of the cone
     * @return the surface area of the cone
     */
    public double getSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height  *height + radius * radius));
    }
    /**
     *Gets the volume of the cone
     *@return the volume of the cone
     */
    public double getVolume() {
        return Math.PI * radius * radius * (height / 3);
    }
}
