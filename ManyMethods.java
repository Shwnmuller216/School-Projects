
/**
 * Write a description of class ManyMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ManyMethods
{
public static void main(){    
Scanner in = new Scanner(System.in);
System.out.println("Enter three numbers"); 
int num1 = in.nextInt();    
int num2 = in.nextInt();    
int num3 = in.nextInt();

System.out.println("The smallest number is " + smallest(num1, num2, num3));
System.out.println(" ");

System.out.println("Enter three numbers"); 
int num8 = in.nextInt();    
int num9 = in.nextInt(); 
int num10 = in.nextInt();
System.out.println("The average is " + average(num8,num9, num10));
System.out.println(" ");

System.out.println("Enter a number: ");
int num4 = in.nextInt();
System.out.println("The first digit of the number is " + firstDigit(num4));
System.out.println(" ");

System.out.println("Enter a number: ");
int num5 = in.nextInt();
System.out.println("The last digit of the number is " + lastDigit(num5));
System.out.println(" ");

System.out.println("Enter a number: ");
int num6 = in.nextInt();
System.out.println("The number of digits for this number is " + Digit(num6));
System.out.println(" ");

System.out.println("Enter a string: ");
String word = in.next();
System.out.println("The number of letters for this string is " + countletters(word));
System.out.println(" ");

System.out.println("Enter two celebrity names");
String n1 = in.next();
String n2 = in.next();
int x1 = n1.length()/2;
int y1 = n1.length();
int x2 = n2.length()/2;
int y2 = n2.length();
String n3 = n1.substring(0,x1) + n2.substring(x2,y2);
String n4 = n2.substring(0,x2) + n1.substring(x1,y1);
System.out.print(n3);
System.out.print(" ");
System.out.print(n4);
}    
public static int smallest(int num1, int num2, int num3){
if (num1 < num2 && num1 < num3){
return num1;
}
else if (num2 < num3 && num2 < num1) {   
return num2;    
}   
else {
return num3; 
    
}    
}    
public static String firstDigit(int num4){
String d1 = (num4) + "";   
d1 = d1.substring(0,1);      
return d1;    
}  
public static String lastDigit(int num5){
String L1 = (num5) + "";   
L1 = L1.substring(L1.length()-1,L1.length());      
return L1;
}
public static int Digit(int num6){
String d = (num6) + "";   
int digits = d.length();      
return digits; 
}    
public static int countletters(String word){
int l = word.length();
int letters = 0;
for (int i = 1; i <= l; i++){  
char Letters = word.charAt(i);
if (Letters  >= 'a' && Letters  <= 'z')     
letters = letters +1;    
}  
return letters; 
}  
public static int average(int num8,int num9,int num10){
int average = ((num8 +num9 + num10) /3);    
return average;   
}   
}
