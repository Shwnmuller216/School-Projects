
/**
 * Write a description of class PetsTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetsTester
{
public static void main(){
//creates objects
Pets dog1 = new Pets();
Pets dog2 = new Pets(2);    
Pets dog3 = new Pets(3, "Joe");    
//prints objects
System.out.println("dog1: " + dog1.doTricks() +" "+ dog1.Ages() + " " + 
dog1.speak());  
System.out.println("dog2: " + dog2.Ages() +" " + dog2.doTricks() + " " +
 dog2.speak());    
System.out.println("dog3: "  +" "+ dog3.Ages() + " "+ dog3.speak() + " " +
dog3.doTricks());
System.out.println("");

dog1.aged(1);    
dog2.aged(2);
dog3.aged(3);

//reprints changed objects
System.out.println("dog1: " + dog1.doTricks() +" "+ dog1.Ages() + " " + 
dog1.speak());  
System.out.println("dog2: " + dog2.Ages() +" " + dog2.doTricks() + " " +
 dog2.speak());    
System.out.println("dog3: "  +" "+ dog3.Ages() + " "+ dog3.speak() + " " +
dog3.doTricks());
System.out.println("");


}
}