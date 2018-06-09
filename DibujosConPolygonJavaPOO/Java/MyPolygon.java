/*
 *Instance class MyPoligon where it is created a poligon for later use the polygon
 *class of java
 */
package dibujosgeometricos;

//import class polygon for create MyPolygon and be able to color it
import java.awt.Polygon;

/**
 *
 * @author Unkn0wnUsr
 */
public class MyPolygon
{
    /*Variables used for the class polygon from java where numberPoints are
     *the total of points, xPoints array is used to save coordinates 'x' and
     *yPoints for save coordinates 'y'
     */
    private int numberPoints;
    private int[] xPoints;
    private int[] yPoints;

    //Empty constructor
    public MyPolygon()
    {
        
    }

    //Constructor with parameters
    public MyPolygon(int numberPoints, int[] xPoints, int[] yPoints)
    {
        this.numberPoints = numberPoints;
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
    
    //Create a polygon using the class polygon from java with our parameters
    public Polygon preparePolygon()
    {
        return new Polygon(this.getxPoints(), this.getyPoints(), this.getNumberPoints());
    }

    //Method to return number of points for the polygon
    public int getNumberPoints()
    {
        return numberPoints;
    }

    //Method to modify number of points 
    public void setNumberPoints(int numberPoints) 
    {
        this.numberPoints = numberPoints;
    }

    //Array return 'x' points
    public int[] getxPoints() 
    {
        return xPoints;
    }
    
    //Method to modify 'x' points from the array
    public void setxPoints(int[] xPoints) 
    {
        this.xPoints = xPoints;
    }

   //Array return 'y' points
    public int[] getyPoints()
    {
        return yPoints;
    }

    //Method to modify 'y' points from the array
    public void setyPoints(int[] yPoints)
    {
        this.yPoints = yPoints;
    }  
}
