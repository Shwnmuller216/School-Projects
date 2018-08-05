
/**
 * Write a description of class BCtonumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BCtonumber
{
    public static void main(){
        Scanner in = new Scanner(System.in);  
        System.out.println("Enter a binary: ");
        String binary = in.next();    
        int width = binary.length();    
        int x = 0;
        int y = 1;
        int p = width - 1;
        double total = 0;
        while(p >= 0){
            if (binary.substring(x,y).equals ("1")){   
                total = total + Math.pow(2,p);   
                x ++;
                y ++;
                p --;

    
            }
            else if(binary.substring(x,y).equals("0")){
                p --;
                x++;
                y++;

    
            }
        } 
        System.out.println(total);
    }
}