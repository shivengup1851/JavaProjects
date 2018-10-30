import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;


public class RectangleComponent extends JComponent { //Shiven Gupta
    public void paintComponent(Graphics graph) {
        Graphics2D g2 = (Graphics2D) graph;          //refers to Graphics2D
         Rectangle box = new Rectangle(5,10,60,85);  //creates new Rectangle object
          g2.draw(box);                              //draws the object
         box.translate(23,47);                       //translates the objects x and y values
          g2.draw(box);                              //draws the translated object
    }
}
