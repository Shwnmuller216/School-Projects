
/**
 * Write a description of class Drink here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drink implements MenuItem
{
    String name;
    double price;
    
    public Drink(String drink,double price2)
    {
        name = drink;
        price = price2;
         
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
