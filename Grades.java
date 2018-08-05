
/**
 * Write a description of class Grades here.
 * Using arrays, it stores the number of grades the user wants.
 * @author (Shawn Muller)
 * @version (11/21/17)
 */
import java.util.Scanner;
public class Grades
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many grades would you like to enter: ");
        int GN = in.nextInt();
        int [] Bob = new int [GN];

        for(int i = 0; i < GN; i++){
            System.out.println("Enter a Grade: ");
            int Grade = in.nextInt();
            Bob[i] = Grade;
        }

        System.out.println(("The average of the grades is ") + printAverage(Bob)); 
       
        System.out.println(("The number of grades above the mean is ") + printAbove(Bob));

        System.out.println(("The number of grades below the mean is ") + printBelow(Bob));
    }

    public static double printAverage(int[] arr){
        double average = 0.0;
        for(int j = 0; j < arr.length; j++)
        {
            average = average + arr[j];
        } 
        average = (average / arr.length) + 0.0;
        average = average * 100;
        if(average%10 >= 5){ 
        average = (int)(average) + 10.0;
        average = average/10;
        average = (int)(average)+0.0;
        average = average/10;
        }
        else if (average%10 < 5){
        average = average/10;    
        average = (int)(average)+0.0;
        average = (average/10);
        }
        return average; 
    }

    public static int printAbove(int[] arr){
        double average = 0.0;
        for(int j = 0; j < arr.length; j++)
        {
            average = average + arr[j];
        } 
        average = (average / arr.length) + 0.0; 
        int above = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > average){
                above ++;
            }    
        } 
        return above;    
    }   

    public static int printBelow(int[] arr){
        double average = 0.0;
        for(int j = 0; j < arr.length; j++)
        {
            average = average + arr[j];
        } 
        average = (average / arr.length) + 0.0; 
        int below = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < average){
                below ++;
            }    
        }  
        return below; 
    }  
}
