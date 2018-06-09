//Instance class for draw ovals with the oval classh of the java API 

package dibujosgeometricos;

/**
 *
 * @author NitaiFraire
 * @date 06/07/18
 */
public class Oval 
{
    //instance variables
    int x, y, width, height;

    //Empty Constructor
    public Oval()
    {
        
    }
    
    //Constructor with parameters
    public Oval(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    //Method to return x
    public int getX()
    {
        return x;
    }

    //Method to modify x
    public void setX(int x)
    {
        this.x = x;
    }

    //Method to return y
    public int getY()
    {
        return y;
    }
    
     //Method to modify y
    public void setY(int y)
    {
        this.y = y;
    }
    
     //Method to return width
    public int getWidth()
    {
        return width;
    }
    
    //Method to modify width
    public void setWidth(int width)
    {
        this.width = width;
    }

    //Method to return height
    public int getHeight() 
    {
        return height;
    }

    //Method to modify height
    public void setHeight(int height) 
    {
        this.height = height;
    }
    
}
