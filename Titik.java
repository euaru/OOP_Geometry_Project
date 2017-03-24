
/**
 * Write a description of class Titik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titik
{
    // instance variables - replace the example below with your own
    private int x, y;
    
    public Titik ()
    {
        
    }
    
    public Titik (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Getter for x
     */
    public int getX ()
    {
        return x;
    }
    
    /**
     * Getter for Y
     */
    public int getY ()
    {
        return y;
    }

    void setX (int x)
    {
        this.x = x;
    }
    
    void setY (int y)
    {
        this.y = y;
    }
    
    void moveInXDir (int x)
    {
        setX(this.x + x);
    }
    
    void moveInYDir (int y)
    {
        setY (this.y + y);
    }
}

