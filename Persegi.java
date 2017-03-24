import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class Persegi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persegi extends Object2D
{
    // instance variables - replace the example below with your own
    private int side;
    private static int jumlahPersegi;
    //private Titik topLeft;

    /**
     * Constructor for objects of class Persegi
     */
    public Persegi(int side, int x, int y)
    {
        super(x,y,"red");
        //topLeft = new Titik();
        this.side = side;
        //topLeft.setX (x);
        //topLeft.setY (y);
        jumlahPersegi++;
    }
    
    public int getSide()
    {
        return this.side;
    }
    
    public void setSide(int side)
    {
        this.side = side;
    }
    
    public int getArea()
    {
        return this.side * this.side;
    }
    
    public int getPerimeter()
    {
        return 4 * this.side;
    }
    
    public void paint()
    {
        if (getIsVisible())
        {
           Canvas screen = Canvas.getCanvas();
           screen.draw(this, getColour(), new Rectangle2D.Double(super.getXReferencePoint(), super.getYReferencePoint(), this.getSide(), this.getSide()) );
           screen.wait(10);
        }
    }
    
    /*
    void scrap()
    {
        if (getIsVisible())
        {
            Canvas screen = Canvas.getCanvas ();
            screen.erase(this);
        }
    }
    */
}
