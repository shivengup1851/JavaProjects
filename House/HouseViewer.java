import javax.swing.JFrame;

public class HouseViewer {
    public static void main (String[] args) {
        
        JFrame frame = new JFrame();
        
        frame.setSize (800,-2000);
        frame.setTitle ("My House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        HouseComponent component = new HouseComponent();
        frame.add(component);
        
        frame.setVisible(true);
        
    }
}