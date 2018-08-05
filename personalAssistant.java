
/**
 * Write a description of class personalAssistant here.
 *
 * @author (Shawn Muller)
 * @version (7/5/18 Version 1.0)
 */
import java.util.Scanner;
public class personalAssistant
{  
    public static void main(){   
        String response = "";              
        Scanner in = new Scanner(System.in); 
        //intro screen
        System.out.println("Greetings, My name is Maggy. I will be your personal assistant.");
        System.out.println("If you would like to exit please enter 'exit'");
        System.out.println("Type 'back' to return to your previous menu");
        System.out.println();
        //Main menu screen
        while(!(response.equals("exit"))){
            //programs features
            System.out.println("1: Calculator");
            System.out.println("2: Conversation feature");
            System.out.println("3: Mega Math cheat sheet");
            System.out.println("4: Fun facts");
            response = in.next();
            //if calculator

            if(response.equals("1")){
                System.out.println("");    
                System.out.println("1: Calculator");    
                System.out.println("");
                System.out.println("1: Arithmatic calculator");
                System.out.println("2: Statistic calculator");
                while(!(response.equals("back"))){
                    //loop for calculator options
                    while(!(response.equals("back"))){
                        response = in.next();
                        // if arithmatic calculator 
                        if(response.equals("1")){
                            double total = 0;
                            double input = 0;
                            System.out.println("1: Arithmatic calculator");
                            System.out.println("");
                            System.out.println("+: Add");
                            System.out.println("-: Subtract");
                            System.out.println("*: Multiply"); 
                            System.out.println("/: Divide");  
                            System.out.println("c: Clear");
                            System.out.println("");
                            System.out.println("Enter a number: ");
                            total = in.nextDouble();
                            while(!(response.equals("back"))){                                                                
                                response = in.next();
                                //add
                                if(response.equals("+")){
                                    System.out.println("Enter the number to be added");
                                    input = in.nextDouble();
                                    System.out.print((total) + " + " + input + " = ");                                    
                                    total = total + input;
                                    System.out.println(total);
                                    System.out.println("");
                                    System.out.println("+: Add");
                                    System.out.println("-: Subtract");
                                    System.out.println("*: Multiply"); 
                                    System.out.println("/: Divide");  
                                    System.out.println("c: Clear");
                                }
                                //divide
                                if(response.equals("/")){
                                    System.out.println("Enter the number to be divided");
                                    input = in.nextDouble();
                                    System.out.print((total) + " / " + input + " = ");                                    
                                    total = total / input;
                                    System.out.println(total);
                                    System.out.println("");
                                    System.out.println("+: Add");
                                    System.out.println("-: Subtract");
                                    System.out.println("*: Multiply"); 
                                    System.out.println("/: Divide");  
                                    System.out.println("c: Clear");
                                }
                                //multiply
                                if(response.equals("*")){
                                    System.out.println("Enter the number to be multiplied");
                                    input = in.nextDouble();
                                    System.out.print((total) + " * " + input + " = ");                                    
                                    total = total * input;
                                    System.out.println(total);
                                    System.out.println("");
                                    System.out.println("+: Add");
                                    System.out.println("-: Subtract");
                                    System.out.println("*: Multiply"); 
                                    System.out.println("/: Divide");  
                                    System.out.println("c: Clear");
                                }
                                //subtract
                                if(response.equals("-")){
                                    System.out.println("Enter the number to be subtracted");
                                    input = in.nextDouble();
                                    System.out.print((total) + " - " + input + " = ");                                    
                                    total = total - input;
                                    System.out.println(total);
                                    System.out.println("");
                                    System.out.println("+: Add");
                                    System.out.println("-: Subtract");
                                    System.out.println("*: Multiply"); 
                                    System.out.println("/: Divide");  
                                    System.out.println("c: Clear");
                                }
                                //clear total + reset
                                if(response.equals("c")){
                                    total = 0;
                                    System.out.println("Enter a number: ");
                                    total = in.nextInt();
                                    System.out.println("+: Add");
                                    System.out.println("-: Subtract");
                                    System.out.println("*: Multiply"); 
                                    System.out.println("/: Divide");  
                                    System.out.println("c: Clear");
                                }

                            }
                        }
                        //if statistic calculator
                        if(response.equals("2")){
                            double total = 0;
                            double median = 0;
                            double mode = 0;
                            double range = 0;
                            double PSTD = 0;
                            System.out.println("2 Statistic calculator");
                            System.out.println("");
                            System.out.print("How many numbers would you like to enter?");
                            //int length = in.nextInt();
                            double [] data = new double[in.nextInt()];
                            System.out.print("Enter the data set with a space bewteen each number: ");
                            for(int i = 0; i < data.length; i++){
                                data[i] = in.nextDouble();  
                                total = total + data[i];
                            }
                            //sort array
                            data = sortLeastToGreatest(data);
                            double temp = 0;                                                                       
                            //median
                            median = data[(data.length/2)];
                            //range
                            range = (data[data.length-1])-(data[0]);                        
                            if(data.length % 2 == 0)
                                median = (data[data.length/2 -1] + data[(data.length/2)])/2;
                            //calls mode method    
                            mode = mode(data);
                            //calls PSTD method
                            PSTD = populationStandardDeviation(data);    
                            double mean = total/data.length;
                            System.out.print("Mean: ");
                            System.out.println(mean);
                            System.out.print("Median: ");
                            System.out.println(median);
                            System.out.print("Mode: ");
                            System.out.println(mode);
                            System.out.print("Range: ");
                            System.out.println(range);
                            System.out.print("Population Standard Deviation: ");
                            System.out.println(PSTD);
                            if(mean > median)
                                System.out.println("Skewed right");
                            if(mean < median)
                                System.out.println("Skewed left");
                            if(mean == median)
                                System.out.println("normally distributed");

                            for(int i = 0; i < data.length; i++){
                                System.out.println(data[i]);                              
                            }
                        }
                        System.out.println("");    
                        System.out.println("1: Calculator");    
                        System.out.println("");
                        System.out.println("1: Arithmatic calculator");
                        System.out.println("2: Statistic calculator");
                        response = in.next();
                    }
                }

            }

            //if conversation
            if(response.equals("2")){
                System.out.println("");    
                System.out.println("Welcome to the conversation feature");

                while(!(response.equals("back"))){    
                    response = in.nextLine();
                    response = response.toLowerCase();
                    int number = 0;  
                    String sentence = "How are we doing";
                    cutSentence(sentence);
                    if(response.equals("howdy")) 
                        System.out.println("Hi");
                    else if(response.equals("Hey bro"))
                        System.out.println("What up");

            
                    else{
                        //generates a random number 0 to 4    
                        number = (int) (Math.random() * 4);
                        if(number == 0)
                            System.out.println("I don't know how to respond to that");            
                        else if(number == 1)
                            System.out.println("RIGHT");             
                        else if(number == 2)
                            System.out.println("Try asking me something else");
                        else if(number == 3)
                            System.out.println("Interesting");
                        else if(number == 4)
                            System.out.println("Error");
                    }
                }
            }
            //if Mega math sheets
            if(response.equals("3")){

            }
            //if fun facts
            if(response.equals("4")){

            }
            if(!(response.equals("exit"))){
                System.out.println("");
                System.out.println("Main Menu");
            }

        }
        System.out.println("Good bye :)");
    }

    public static double [] sortLeastToGreatest(double [] dataSet){
        double temp = 0;    
        int count = 0;
        double [] data = new double[dataSet.length];
        //sort
        for(int i = 0; i < dataSet.length; i++){
            for(int j = 0; j < dataSet.length; j++){    
                if(dataSet[i] > dataSet[j]){    
                    count++;                                      
                }
            }    
            data[count] = dataSet[i];
            count = 0;
        }
        //if repeat numbers exist    
        for(int i = 1; i < data.length; i++){
            if(data[i-1] != 0 && data[i] == 0)    
                data[i] = data[i-1];            
        }
        return data;  
    }

    public static double mode(double [] dataSet){
        double mode = 1;    
        int repeat = 1;
        int count = 1;
        for(int i = 0; i < dataSet.length; i++){
            for(int j = 0; j < dataSet.length; j++){
                if(dataSet[i] == dataSet[j])
                    repeat++;
            }
            if(repeat > count){
                mode = dataSet[i];
                count = repeat;
            }
            repeat = 1;
        }
        return mode;
    }

    public static double populationStandardDeviation(double [] dataSet){
        double STD = 0;    
        double total = 0;
        double mean = 0;
        for(int i = 0; i < dataSet.length; i++){
            total = total + dataSet[i];    
        }
        //step1: calculate mean
        mean = total/dataSet.length;
        total = 0;
        for(int i = 0; i < dataSet.length; i++){
            total = total + ((mean - dataSet[i])*(mean - dataSet[i]));    
        }
        //step2: calculate average of dif. squares
        STD = total/dataSet.length;
        //step3: square root
        STD = Math.sqrt(STD);

        return STD;
    }

    public static boolean findKeyWord(String str){

    
        
        
        return false;    
    }

    public static String cutSentence(String sentence){
        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.substring(i,i+1).equals(" ")){
                System.out.println(sentence.substring(i-count,i));
                count = 0;
            }
            //else if(i = sentence.length())
            
            else
                count++;
        }
        System.out.println(sentence.substring(sentence.length()-count,sentence.length()));
        return "";
    }

    public static void searchWord(String word){

    }
}

