
/**
 * Write a description of class Mathcalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Mathcalculator
{
    public static int LCM(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Integers"); 
        int x = in.nextInt();
        int y = in.nextInt();
        int Xtotal = x;
        int Ytotal = y;
        while (!(Xtotal == Ytotal)){
            while (Xtotal < Ytotal){    
                Xtotal = Xtotal + x;    
            }   
            while(Xtotal > Ytotal){   
                Ytotal = Ytotal + y;   
            }
        } 
        int LMC = Xtotal;
        return LMC;

    }       

    public static int GCF(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers");
        int x = in.nextInt();
        int y = in.nextInt();

        if (x > y){
            while (!(x % y == 0)){    
                x = y;    
                y = x % y;    
            } 
        }    
        else if (y > x){
            while (!(y % x == 0)){    
                y = x;    
                x = y % x;    
            }

        }
        int GCF = x;
        if (x > y){
            GCF = y;   
        }    
        else if ( y > x){
            GCF = x;
        }
        return GCF;
    }

    public static int BinaryConverterToDecimal(){
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a binary number: ");
        String binaryString =in.next();

        int number = Integer.parseInt(binaryString,2);
        return number;
    }

    public static void main(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n= in.nextInt();
        int  bin[]=new int[100];
        int i = 0;
        while(n > 0)
        {
            bin[i++] = n%2;
            n = n/2;
        }
        for(int j = i-1;j >= 0;j--)
        {
            System.out.print(bin[j]);
        }

    }  
}

