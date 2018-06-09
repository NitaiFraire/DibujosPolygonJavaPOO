/*
 * Instance class to define the line of the draw with the Point class
 */
package dibujosgeometricos;

/**
 *
 * @author NitaiFraire
 * @date 06/07/18
 */
public class Straight
{
    //From type Point define startPoint, endPoint
    private Point startPoint;
    private Point endPoint;
    
    //Empty constructor
    public Straight()
    {
                
    }
    
    //Constructor with parameters
    public Straight(Point startPoint, Point endPoint)
    {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    
    //Method to return start point
    public Point getStartPoint()
    {
        return startPoint;
    }

    //Method to modify start point
    public void setStartPoint(Point startPoint)
    {
        this.startPoint = startPoint;
    }

    //Method to return end point
    public Point getEndPoint() 
    {
        return endPoint;
    }

    //Method to modify end point
    public void setEndPoint(Point endPoint) 
    {
        this.endPoint = endPoint;
    }    
}
