
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{    
public static void main(){    
Salad saladObj = new Salad("Spinach Salad",1.25);   
Sandwich sandwichObj = new Sandwich("Club Sandwich",0.75);
Drink drinkObj = new Drink("Orange Soda",1.10);   
    
    
    
Trio trio = new Trio(saladObj,drinkObj,sandwichObj);
System.out.println(trio.getName());
System.out.println(trio.getPrice());


}   




}