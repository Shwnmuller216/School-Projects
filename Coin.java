
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin implements Measurable 
{
    private double value;
    private String name;
    
    public Coin(){
        value = 0.25;
        name = "quarter";
    }
    
    public Coin(double val)
    {
        value = val;
    }
    
    public double getMeasure()
    {
        return value;
    }
    
}