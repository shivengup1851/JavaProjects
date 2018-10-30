import javax.swing.JOptionPane;
//Shiven Gupta
public class IceCreamConeTester {
    public static void main (String[] args) {
        //Displays windows asking for the dimensions of the cone
        String input = JOptionPane.showInputDialog("Enter the height of the cone:");
        double height = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter the radius of the cone:");
        double radius = Double.parseDouble(input2);
        
        //Creates a new IceCreamCone object
        IceCreamCone x = new IceCreamCone (height, radius);
        
        //Displays the volume and the surface area of the cube
        JOptionPane.showMessageDialog(null, "Surface Area: " + x.getSurfaceArea() + "\nVolume: " + x.getVolume());
        
        //Terminates the program
        System.exit(0);
      
    }
}
