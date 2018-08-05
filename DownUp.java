
/**
 * Write a description of class DownUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DownUp
{
public static void main(){
Scanner in = new Scanner(System.in);    
String statement = in.next();    
int x = 0;
int y = 1;
int z = statement.length();    
   
for (int i = 0; i < z; i++)    
{    
System.out.print(statement.substring(x,y));        
y ++;    




} 
y = z;
for (int i = 0; i < z; i++)    
{   
System.out.print(statement.substring(x,y));        
y--;    
if (y == 0){
x = 0;
y = 1;
}
} 


   
}    
}    
