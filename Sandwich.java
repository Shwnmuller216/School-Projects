
/**
 * Write a description of class Sandwich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sandwich implements MenuItem
{
    String name;
    double price;
    
    public Sandwich(String sandwich, double price2)
    {
        name = sandwich;
        price = price2;
        if (sandwich.equals("Club Sandwich")){
         price = 0.75;
        }
         if (sandwich.equals("Cheeseburger")){
         price = 2.75;
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
