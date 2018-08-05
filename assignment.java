
/**
 * Write a description of class assignment here.
 *
 * @author (Shawn Muller)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
public class assignment
{
    public static void main()throws FileNotFoundException{
        FileReader file = new FileReader("fileInput2.TXT");
        Scanner in = new Scanner(file);
        Scanner in2 = new Scanner(System.in);  
        int count = 0;
        while(in.hasNext())
        {
            String input = in.next();
            count++;
        }
        in.close();

        System.out.println(count);
        //need a new file in order to reread the info.
        FileReader file2 = new FileReader("fileInput2.TXT");
        in = new Scanner(file2);

        String [] bell = new String[count]; 
        int j = 0;
        while(in.hasNext())
        {
            bell[j] = in.next();

            //System.out.println(bell[j]);

            j++;
        }    

        System.out.println(("The Longest Word is ") + findLongestWord(bell));
        System.out.println("");

        System.out.println(("The Shortest Word is ") + findShortestWord(bell));
        System.out.println("");

        System.out.println("Enter an ending for a word ");
        String ending = in2.next();
        System.out.print("The number of words ending with " + ending + " is "); 
        System.out.print(countWordsEndingWith(bell, ending));
        System.out.println("");

        System.out.println("Enter a begining for a word ");
        String beg = in2.next();
        System.out.print("The number of words starting with " + beg + " is "); 
        System.out.print(countWordsEndingWith(bell, beg));

    }

    public static String findLongestWord(String[] arr){
        int i = 0; 
        int j = 1;
        String LongestWord = arr[i];
        for (int z = 0; z < arr.length; z++){    
            if(arr[i].length() >= arr[j].length()){    
                j++;      
                if(j == arr.length){
                    z = arr.length;
                }
            }
            else {
                i = j;
                j++;  
                if(j == arr.length){
                    z = arr.length;
                }
            }   
        }
        LongestWord = arr[i];
        return LongestWord;
    }

    public static String findShortestWord(String[] arr){
        int i = 0; 
        int j = 1;
        String ShortestWord = arr[i];
        for (int z = 0; z < arr.length; z++){    
            if(arr[i].length() <= arr[j].length()){    
                j++; 
                if(j == arr.length){
                    z = arr.length;
                }
            }
            else {
                i = j;
                j++; 
                if(j == arr.length){
                    z = arr.length;
                }
            }   
        }
        ShortestWord = arr[i];
        return ShortestWord;  
    }

    public static int countWordsEndingWith(String[] arr, String str){
        int counting = 0; 
        int lengthy = str.length();
        int i = 0;
        int z = 0;
        for (int j = 0; j < arr.length; j++){
            if(lengthy > arr[z].length()){
                     z++;
            }
               else{
               if((arr[z].substring(arr[i].length()-lengthy-1, arr[i].length()-1).equals(str))){
                    counting++; 
                    z++;
                    if(j == arr.length){
                        z = arr.length;
                    }

                }
               
               if(j == arr.length){
                    z = arr.length;
                }

            }
        }
        return counting;
    }

    public static int countWordsStartingWith(String[] arr, String str){
        int counting = 0; 
        int lengthy = str.length();
        int i = 0;
        int z = 0;
        for (int j = 0; j < arr.length; j++){ 
            if((arr[z].substring(0, lengthy-1).equals(str))){
                counting++; 
                z++;
            }
            else
                z++;

        }

        return counting;

    }
}




//if(lengthy == arr[z].length()){
                // if (str==arr[z]){
                     
                     
                    //}
                    //}