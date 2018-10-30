import javax.swing.JFrame;

public class RectangleViewer { //Shiven Gupta
    public static void main(String[] args) {
        JFrame frame = new JFrame();                          //JFrame object is constructed
        
        frame.setSize(400,700);                               //sets dimensions of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame will exit when clicked
        frame.setTitle("RectangleViewer");                    //sets title of frame
        
        RectangleComponent x = new RectangleComponent();       
        frame.add(x);                                         //RectangleComponent object is constructed and added to the frame
        
        frame.setVisible(true);                               //frame will be visible
  
        
    }
}
