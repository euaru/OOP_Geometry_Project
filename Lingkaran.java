import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lingkaran extends Object2D
{
    // instance variables - replace the example below with your own
    private int radius;
    private final static double PHI = 3.14;
    private static int jumlahLingkaran;
    //private Titik centre;
    //private String colour;
   // private boolean isVisible;
    
    /**
     * Constructor for objects of class Bola
     */
    public Lingkaran(int r, int x, int y)
    {
        super(x,y,"blue");
        //centre  = new Titik();
        //centre.setX (x);
        //centre.setY (y);
        jumlahLingkaran++;
        radius=r;
        //colour = "blue";
        //isVisible = true;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public void setRadius (int radius)
    {
        this.radius = radius;
    }
    
    public double getArea ()
    {
        return Lingkaran.PHI * this.radius * this.radius;
    }
    
    public double getPerimeter ()
    {
        return 2 * Lingkaran.PHI * this.radius;
    }
    
    public void paint()
    {
        double diameter=getRadius()*2.;
        if (getIsVisible())
        {
           Canvas screen = Canvas.getCanvas();
           screen.draw(this, getColour(), new Ellipse2D.Double(super.getXReferencePoint(), super.getYReferencePoint(), diameter, diameter) );
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
    
   /* 
        public static void main (String[] args)
        {
            Lingkaran a = new Lingkaran(10, 5, 5);
            Lingkaran b = new Lingkaran(15, 10, 10);
            
            System.out.println ("Jumlah Lingkaran: " + Lingkaran.jumlahLingkaran);
            System.out.println ("Radius lingkaran a: " + a.radius);
            System.out.println ("Radius lingkaran b: " + b.radius);
        }
   */
}
