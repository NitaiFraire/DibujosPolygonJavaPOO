package dibujosgeometricos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author NitaiFraire
 */
public class MyName extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        MyPolygon n = new MyPolygon();
        n.setNumberPoints(10);
        
        int[] coordinatesX = {200, 200, 230, 270, 270, 300, 300, 270, 230, 230};
        int[] coordinatesY = {200, 100, 100, 150, 100, 100, 200, 200, 150, 200};
        
        n.setxPoints(coordinatesX);
        n.setyPoints(coordinatesY);
        
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(n.preparePolygon());
        
        MyPolygon i1 = new MyPolygon();
        i1.setNumberPoints(12);
        
        int[] coordinatesX2 = {330, 330, 360, 360, 330, 330, 420, 420, 390, 390, 420, 420};
        int[] coordinatesY2 = {200, 180, 180, 120, 120, 100, 100, 120, 120, 180, 180, 200};
        
        i1.setxPoints(coordinatesX2);
        i1.setyPoints(coordinatesY2);
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(i1.preparePolygon());
        
        MyPolygon t = new MyPolygon();
        
        t.setNumberPoints(8);
        
        int[] coordinatesX3 = {470, 470, 445, 445, 525, 525, 500, 500};
        int[] coordinatesY3 = {200, 120, 120, 100, 100, 120, 120, 200};
        
        t.setxPoints(coordinatesX3);
        t.setyPoints(coordinatesY3);
        
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(t.preparePolygon());
        
        MyPolygon a = new MyPolygon();
        
        a.setNumberPoints(6);
        
        int[] coordinatesX4 = {540, 590, 640, 600, 590 ,580};
        int[] coordinatesY4 = {200, 100, 200, 200, 175, 200};
        
        a.setxPoints(coordinatesX4);
        a.setyPoints(coordinatesY4);
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(a.preparePolygon());
        
        MyPolygon i2 = new MyPolygon();
        
        i2.setNumberPoints(12);
        
        int[] coordinatesX5 = {660, 660, 690, 690, 660, 660, 750, 750, 720, 720, 750, 750};
        int[] coordinatesY5 = {200, 180, 180, 120, 120, 100, 100, 120, 120, 180, 180, 200};
        
        i2.setxPoints(coordinatesX5);
        i2.setyPoints(coordinatesY5);
        
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(i2.preparePolygon());
        
        Straight s = new Straight();
        
        s.setStartPoint(new Point(180, 220));
        s.setEndPoint(new Point(770, 220));
        
        g.setColor(Color.BLACK);
        
        g.drawLine(s.getStartPoint().getX(), s.getStartPoint().getY(),
                   s.getEndPoint().getX(), s.getEndPoint().getY());
        
        
    }
            
}
