
/**
 * Write a description of class Nestedloop1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Nestedloops1
{
public static void main ()
{
Scanner in = new Scanner(System.in);
System.out.println("How many rows?");
int rows = in.nextInt();
System.out.println("How many columns?");
int columns = in.nextInt();
String r = "";
for (int i = 1; i <= rows; i++)
{  

for (int j = 1; j <= columns; j++)
{   
r = r + "[]";    

    
          
}  
r = r + "\n"; 
}   
System.out.print(r);   
     
    
    

    
    
    
}    

}
