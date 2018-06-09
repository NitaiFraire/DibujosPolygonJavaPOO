/*
 *Aplication to draw a house
 */
package dibujosgeometricos;

//libraries to graphics, color, panel
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author NitaiFraire
 * @date 06/07/18
 */

//Jpanel create a panel to contain the draw
public class Draw extends JPanel
{
    //Create object g from Graphics
    public void paintComponent(Graphics g)
    {
        //Heredate Paint components to object 'g'
        super.paintComponents(g);
        
        //Facade
        
        //Create object p1 from MyPolygon class
        MyPolygon p1 = new MyPolygon();
    
        //Add 4 points to the polygon
        p1.setNumberPoints(4);
        
        //Coordenates
        int[] coordinatesX = {130, 280, 280, 130};
        int[] coordinatesY = {300, 300, 200, 200};
        
        //Add coordinates to the object
        p1.setxPoints(coordinatesX);
        p1.setyPoints(coordinatesY);
        
        //Color selection to fill the polygon
        g.setColor(Color.black);
        
        //Use the polygon class from java, metod preparePolygon such as parameters
        g.fillPolygon(p1.preparePolygon());
        
        //Door
        
        //Create object p2 from MyPolygon class
        MyPolygon p2 = new MyPolygon();
        
        //Add 4 points to the polygon
        p2.setNumberPoints(4);
        
        //Coordenates
        int[] coordinatesX2 = {140, 170, 170, 140};
        int[] coordinatesY2 = {300, 300, 250, 250};
        
        //Add coordinates to the object
        p2.setxPoints(coordinatesX2);
        p2.setyPoints(coordinatesY2);
        
        //Color selection to fill the polygon
        g.setColor(Color.gray);
        
        //Use the polygon class from java, metod preparePolygon such as parameters
        g.fillPolygon(p2.preparePolygon());
        
        //Roff
        
        //Create object p3 from MyPolygon class
        MyPolygon p3 = new MyPolygon();
        
        //Add 3 points to the polygon
        p3.setNumberPoints(3);
        
        //Coordenates
        int[] coordinatesX3 = {100, 310, 205};
        int[] coordinatesY3 = {200, 200, 140};
        
        //Add coordinates to the object
        p3.setxPoints(coordinatesX3);
        p3.setyPoints(coordinatesY3);
        
        //Color selection to fill the polygon
        g.setColor(Color.gray);
        
        //Use the polygon class from java, metod preparePolygon such as parameters
        g.fillPolygon(p3.preparePolygon());
        
        //Sun
        
        //Create object o1 from oval class 
        Oval o1 = new Oval();
        
        //Add parameters required for draw the oval
        o1.setX(300);
        o1.setY(40);
        o1.setWidth(80);
        o1.setHeight(80);
        
        //Color selection to the oval
        g.setColor(Color.red);
        
        //Draw the oval with method fillOval, receive such as parameters
        //the attributtes from object o1
        g.fillOval(o1.getX(), o1.getY(), o1.getWidth(), o1.getHeight());
        
        //Grass
        
        //Create object s1 from Straight class 
        Straight s1 = new Straight();
        
        //Create a point such as parameters  from start and end point
        s1.setStartPoint(new Point(0, 300));
        s1.setEndPoint(new Point(400, 300));
        
        //Color selection to the straight
        g.setColor(Color.GREEN);
        
        //get coordenate 'x' and 'y' from start point
        //get coordenate 'x' and 'y' from end point
        g.drawLine(s1.getStartPoint().getX(), s1.getStartPoint().getY(),
                   s1.getEndPoint().getX(), s1.getEndPoint().getY());
        
     }
}
