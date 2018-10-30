import javax.swing.JFrame;

public class FaceViewer { //Shiven Gupta
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //creates frame
        frame.setSize(400,400); //sets dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the default close operation
        frame.setTitle("FaceViewer"); //sets title
        
        FaceComponent component = new FaceComponent(); //creates new FaceComponent object
        frame.add(component);
        
        frame.setVisible(true); //frame will be visible
}
}
