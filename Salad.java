
/**
 * Write a description of class Salad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salad implements MenuItem
{
    private String name;
    private double price;
    
    public Salad(String salad, double price2)
    {
        name = salad;
        price = price2;
        if (salad.equals("Spinach Salad")){
         price = 1.25;
        }
         if (salad.equals("Coleslaw")){
         price = 1.25;
        }        
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }

 
}
