import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

public class House {
    
    private int x;
    private int y;
    
    public House (int leftx, int lefty) {
        
        x = leftx;
        y = lefty;
    }
    public void draw(Graphics2D g2) {
        
        Rectangle house = new Rectangle (x , y - 500 , 500 , 500); 
        Rectangle garage = new Rectangle (x + 50 , y - 100 , 50 , 100);
        Rectangle door = new Rectangle (x + 310 , y - 100 , 20 , 100);
        Ellipse2D.Double knob = new Ellipse2D.Double (x + 320 , y - 50 , 10 , 10);
        Rectangle window1 = new Rectangle (x + 50 , y - 450 , 20 , 20);
        Rectangle window2 = new Rectangle (x + 200 , y - 450 , 20 , 20);
        Rectangle window3 = new Rectangle (x + 350 , y - 450 , 20 , 20);
        
        Point2D.Double r1 = new Point2D.Double (x , y - 500);
        Point2D.Double r2 = new Point2D.Double (x + 250 , y - 650);
        Point2D.Double r3 = new Point2D.Double (x + 500 , y - 500);
        
        Line2D.Double roofStart = new Line2D.Double (r1 , r2);
        Line2D.Double roofFinish = new Line2D.Double (r2 , r3);
        
        g2.draw(house);
        g2.draw(garage);
        g2.draw(door);
        g2.draw(knob);
        g2.draw(window1);
        g2.draw(window2);
        g2.draw(window3);
        g2.draw(roofStart);
        g2.draw(roofFinish);
       
    }
}
                     