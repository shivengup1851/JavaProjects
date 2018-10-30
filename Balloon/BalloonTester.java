//Shiven Gupta
public class BalloonTester {
    public static void main (String[] args) {
        //Creates my object variable
        Balloon x = new Balloon();
        //Prints the operations and expected values
        System.out.println("Volume: " + x.getVolume());
        System.out.println("Expected: 0.0");
        System.out.println("Surface Area: " + x.getSurfaceArea());
        System.out.println("Expected: 0.0");
        System.out.println("Radius: " + x.getRadius());
        System.out.println("Expected: 0.0\n");
        //Adds 100cm^3 of air
        x.addAir(100);
        
        System.out.println("Volume: " + x.getVolume());
        System.out.println("Expected: 100.0");
        System.out.println("Surface Area: " + x.getSurfaceArea());
        System.out.println("Expected: 104.1879415");
        System.out.println("Radius: " + x.getRadius());
        System.out.println("Expected: 2.8794119\n");
        //Adds another 100cm^3 of air
        x.addAir(100);
        
        System.out.println("Volume: " + x.getVolume());
        System.out.println("Expected: 200.0");
        System.out.println("Surface Area: " + x.getSurfaceArea());
        System.out.println("Expected: 165.3880481");
        System.out.println("Radius: " + x.getRadius());
        System.out.println("Expected: 3.6278317\n");
        
    }
}
