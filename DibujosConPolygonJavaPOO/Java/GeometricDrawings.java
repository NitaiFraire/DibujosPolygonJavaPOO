//In this class it will be declared the draw
package dibujosgeometricos;

//import JFrame from javax.swing
import javax.swing.JFrame;

/**
 *
 * @author Unkn0wnUsr
 */
public class GeometricDrawings
{

    public static void main(String[] args) 
    {
        //Create object type JFrame
        JFrame marco = new JFrame("MyDraw");
        
        //when close the framework end the aplication
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add the draw at the framework
        MyName DrawPanel = new MyName();
        marco.add(DrawPanel);
        
        //panel dimension
        marco.setSize(1000, 400);
        
        //visible draw
        marco.setVisible(true);
        
        
        
        
    }
    
}
