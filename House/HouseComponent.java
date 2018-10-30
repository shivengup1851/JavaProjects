import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HouseComponent extends JComponent {
    
    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        
        House main = new House (0 , -500);
        
        main.draw(g2);
        
    }
}
