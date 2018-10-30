/**
 * Balloon calculates the radius, volume, and surface area of a spherical balloon
 * Shiven Gupta
 */
public class Balloon {
    
    //Creates my instance variables
    private double radius;
    private double volume;
   
    /**
     * Initializes my instance variables
     */
    public Balloon () {
        radius = 0;
        volume = 0;
    }
    
    /**
     * Gets the surface area of the balloon
     * @return the surface area of the balloon
     */
    public double getSurfaceArea() {
        //Calculation for surface area
        return 4 * Math.PI * radius * radius;
    }
    
    /**
     * Gets the volume of the balloon
     * @return the volume of the balloon
     */
    public double getVolume() {
        
        return volume;
    }
    
    /**
     * Gets the radius of the balloon
     * @return the radius of the balloon
     */
    public double getRadius() {
       
        return radius;
    }
    
    /**
     * Sets the air and calculates the volume and radius
     * @param air the amount of air added to the balloon
     */
    public void addAir(double air) {
       //Sets the volume
       volume = volume + air;
       //Calculates the radius
       radius = Math.cbrt(3 * (volume / (4 * Math.PI)));
        
    }
}