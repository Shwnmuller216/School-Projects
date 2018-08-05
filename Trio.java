
/**
 * Write a description of class Trio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trio implements MenuItem
{
    private Sandwich sandwichObj;
    private Salad saladObj;
    private Drink drinkObj;
    private double price;
    private String name;
    /**
     * Constructor for objects of class Trio
     */
    public Trio(Salad salad,Drink drink,Sandwich sandwich)
    {

        sandwichObj = sandwich;
        saladObj = salad;  
        drinkObj = drink;

        name = saladObj.getName() + " | " + sandwichObj.getName() + " | " + drinkObj.getName() + " trio.";
        price = sandwichObj.getPrice() + saladObj.getPrice()+ drinkObj.getPrice() - Math.min(Math.min(sandwichObj.getPrice(),saladObj.getPrice()),drinkObj.getPrice());      

        System.out.println(sandwichObj.getPrice());
        System.out.println(drinkObj.getPrice());
        System.out.println(saladObj.getPrice());

   
    }

    public double getPrice()
    {       
        //return determinePrice(sandwichObj,saladObj,drinkObj);    
        return price;        
    }

    public String getName()
    {
        return name;
    }

    //private double determinePrice(Sandwich sandwich,Salad salad,Drink drink)
    // {
    // double price = 0;

    //if(sandwich.getPrice() > drink.getPrice() && salad.getPrice() > drink.getPrice())
    // return sandwich.getPrice() +  salad.getPrice();   

    
    
    
    //return price;    
    // }

} 

