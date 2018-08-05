/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Recursion
{
    public static void main() throws IllegalArgumentException{   
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter an integer: ");    
        int n = in.nextInt(); 
        System.out.println(starString(n));   
        System.out.println(""); 
        waysToClimb(n);     

    }

    public static String starString(int n){

        if(n == 0)
            return  "*";
        else 
            return starString(n-1) + starString(n-1);
    }

    public static void waysToClimb(int n){
        waysToClimb(n, "");
    }

    private static void waysToClimb(int n, String s){
        if(n == 0)    
            System.out.println(s);    
        else if(n == 1)    
            System.out.println(s+1);    

        else{
             waysToClimb(n-1,s+"1 ");
             waysToClimb(n-2,s+"2 ");
            // waysToClimb(n-3,s+"3 ");
    }
}
    public static void waysToClimb2(int n, String s){
        if(n == 0)    
            System.out.println(s);    
        else if(n == 1)    
            System.out.println(s+1); 
            else if (n == 2){
             waysToClimb2(n-1,s+"1 ");
             waysToClimb2(n-2,s+"2 ");
            }

        else{
             waysToClimb2(n-1,s+"1 ");
             waysToClimb2(n-2,s+"2 ");
             waysToClimb2(n-3,s+"3 ");
    }
}
}
