import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Rectangle;

public class FaceComponent extends JComponent { //Shiven Gupta
    public void paintComponent(Graphics graph) {
        Graphics2D g2 = (Graphics2D) graph; 
        g2.setColor(Color.ORANGE); //sets color to orange
        Ellipse2D.Double face = new Ellipse2D.Double(50,50,300,300); //creates head
        g2.draw(face); //draws the face
        g2.fill(face); //fills the face
        
        g2.setColor(Color.BLUE); //sets color to blue
        Rectangle leftEye = new Rectangle(100,110,20,20); //creates left eye
        g2.fill(leftEye); //fills the left eye
        
        g2.setColor(Color.GREEN); //sets color to green
        Ellipse2D.Double rightEye = new Ellipse2D.Double(280,110,20,20); //creates right eye
        g2.fill(rightEye); //fills the right eye
        
        g2.setColor(Color.BLACK); //sets color to black
        Ellipse2D.Double nose = new Ellipse2D.Double(190,195,20,10); //creates nose
        g2.draw(nose); //draws the nose
        
        Line2D.Double mouth = new Line2D.Double(110,250,290,250); //creates mouth
        g2.draw(mouth); //draws the mouth
}
}
