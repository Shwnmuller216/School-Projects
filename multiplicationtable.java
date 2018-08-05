
/**
 * Write a description of class multiplicationtable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class multiplicationtable
{
public static void main ()
{
Scanner in = new Scanner(System.in);

for (int i = 1; i <= 12; i++)
{
    
for (int j = 1; j <= 12; j++)
{
int number = (i*j);    
System.out.print((number) + ("   "));
    




    
}  
System.out.println(" "); 
}    
}
}
