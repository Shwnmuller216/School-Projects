
/**
 * Write a description of class BCtobinary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BCtobinary
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = in.nextInt();
        String value = "";
        while(x / 2 != 0){    
            if (x % 2 == 0) {   
                value = "0" + value;
                x = x / 2;
            }
            else if (x % 2 == 1){
                value = "1" + value;
                x = x / 2;
            }   

        }    
        System.out.println(value);
    }
}