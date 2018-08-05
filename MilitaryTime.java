
/**
 * Write a description of class MilitaryTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MilitaryTime
{
    public static void main(){
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter two military times: ");    
        int t1 = in.nextInt();    
        int t2 = in.nextInt();    

        if (t1 > t2){
            int diff = (t1 * 60) - (t2 * 60);
            int hour = diff / 60;
            hour = hour / 100;
            int minutes = diff / 60; 
            minutes = minutes % 100;
            System.out.println(hour + " hours and " + minutes +" minutes");       
        }
        else if (t2 > t1)
        {
            int diff = (t2 * 60) - (t1 * 60);    
            int hour = diff / 60; 
            hour = hour / 100;
            int minutes = diff / 60;
            minutes = minutes % 100;
            System.out.println(hour + " hours and " + minutes +" minutes");    
        }    
    }    
}
