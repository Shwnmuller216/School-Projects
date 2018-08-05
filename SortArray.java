
/**
 * Write a description of class SortArray here.
 *
 * @author (Shawn Muller)
 * @version (a version number or a date)
 */
import java.io.*; 
import java.util.Scanner;
public class SortArray
{
    public static void main() throws FileNotFoundException{
        FileReader file = new FileReader("numbers.txt");
        Scanner in = new Scanner(file);
        Scanner in2 = new Scanner(System.in);  
        int count = 0;
        while(in.hasNextInt())
        {
            int input = in.nextInt();
            count++;
        }

        in.close();

        //System.out.println(count);
        //need a new file in order to reread the info.
        FileReader file2 = new FileReader("numbers.TXT");
        in = new Scanner(file2);

        int [] bell = new int[count]; 
        int j = 0;
        while(in.hasNextInt())
        {
            bell[j] = in.nextInt();

            //System.out.println(bell[j]);

            j++;
        }    
        int [] bell2 = new int[bell.length];
        bell2 = reverse(bell);
        int [] bell3 = new int[bell.length];
        bell3 = sort(bell);

        System.out.println("The original array is ");
        printArray(bell);
        System.out.println("");

        System.out.println("The array in reverse is ");
        printArray(bell2);
        System.out.println("");

        System.out.println(("The array sorted from greatest to least is "));
        printArray(bell3);
        System.out.println("");
        System.out.println("");
    }

    public static int [] reverse(int [] arr){

        int [] arrr = new int[arr.length];
        int z = 1;
        for(int i = 0; i < arr.length; i++){
            arrr[i] = arr[arr.length-z]; 
            z++;
        }

        return arrr;
    }

    public static int[] sort(int [] arr){    
        int [] arrr = new int[arr.length];
        int count = 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++){    
            for(j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                     
                    count++;  
            //count deteremines the position of the number in the new array
               if(arr[i] == arr[j]) {
            if(i!=j){        
            count = j;     
            j = arr.length;              
            //Fill array with any repeat number
        }
        else {
         int noUse = 0;  
    }
                }
                }
            }   
            arrr[count] = arr[i]; 
            //places number in new array
            count = 0;
            //resets count
        }

    
        return arrr;
    }

    public static void printArray(int[] arr){
        System.out.print("[");  
        for(int i = 0; i < arr.length; i++){  
            if (i == arr.length-1){
                System.out.print(arr[i]);  
            }
            else 
                System.out.print(arr[i] + ", ");  
        }
        System.out.print("]");

    }
}

