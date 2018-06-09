/*
 * Instance class Point to define a point where the Straight will be draw
 */
package dibujosgeometricos;

/**
 *
 * @author NitaiFraire
 * @date 06/07/18
 */
public class Point
{
    //variables x, y  type int and access private
    //to indicate the coordinates to draw
     private int x, y;
     
     //Method constructor from class Point without parameters
     public Point()
     {
         x = 0;
         y = 0; 
     }
     
     //method constructor from class Punto, receive x and y as a parameter
     public Point(int x, int y)
     {
         this.x = x;
         this.y = y;
                 
     }
     
     //Method getX to return coordinate x
     public int getX()
     {
         return x;
     }
     
     //Method setX to modify coordinate x
     public void setX(int x)
     {
         this.x = x;
     }
     
     //Method getY to return coordinate y
     public int getY()
     {
         return y;
     }
     
     //Method setY to modify coordinate y
     public void setY(int y)
     {
         this.y = y;
     } 
}
