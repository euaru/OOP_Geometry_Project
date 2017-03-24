
/**
 * Write a description of class Object2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Object2D
{
    // instance variables - replace the example below with your own
    private String colour;
    private boolean isVisible;
    private Titik referencePoint;
    
    
    public Object2D(int x, int y, String c)
    {
        colour = c;
        isVisible = true;
        referencePoint = new Titik (x, y);
        //referencePoint.setX(x);
        //referencePoint.setY(y);
    }
    
    int getXReferencePoint()
    {
        return referencePoint.getX();
    }
    
    int getYReferencePoint()
    {
        return referencePoint.getY();
    }
    
    void setXReferencePoint(int x)
    {
        referencePoint.setX(x);
    }
    
    void setYReferencePoint(int y)
    {
        referencePoint.setY(y);
    }
    
    void moveReferencePointInX (int dx)
    {
        int i;
        for (i = 0; i < dx; i+=1)
        {
            setXReferencePoint(this.getXReferencePoint() + dx);
            paint ();
        }
    }
    
    void moveReferencePointInY (int dy)
    {
        int i;
        for (i = 0; i < dy; i+=1)
        {
            setXReferencePoint(this.getXReferencePoint() + dy);
            paint ();
        }
    }

    public String getColour()
    {
        return this.colour;
    }
    
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    
    public boolean getIsVisible()
    {
        return this.isVisible;
    }
    
    public void setIsVisible (boolean isVisible)
    {
        this.isVisible = isVisible;
    }
    
    public abstract void paint();
    
    public void scrap()
    {
        if (getIsVisible())
        {
            Canvas screen = Canvas.getCanvas ();
            screen.erase(this);
        }
    }
}
