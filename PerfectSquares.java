
/**
 * Write a description of class PerfectSquares here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PerfectSquares
{
public static void main(){
Scanner in = new Scanner(System.in);  
System.out.println("Enter a number: ");
int number = in.nextInt();
int number2 = 0;
int x = 1;
double PS = 0;
while (number >= PS){  
if (PS > 0) {   
System.out.print((PS) + ", ");
}
PS = Math.pow(x,2);
x ++;

}
}    
}
