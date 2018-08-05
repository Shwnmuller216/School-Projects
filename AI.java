
/**
 * Write a description of class AI here.
 * AI that can answer trivia questions. Simiulate human brain function.
 * @author (Shawn Muller)
 * @version (AI 1.0(5/16/18))
 */
import java.util.*;
public class AI
{
    private static ArrayList<String> vocab = new ArrayList<String>(1); 
    private static ArrayList<Double> numbers = new ArrayList<Double>(1);
    private static String [] [] brain = new String [20] [2];
   // private String [][]brain;
    // instance variables - replace the example below with your own   
    /**
     * Constructor for objects of class AI
     */
    public AI()
    {
    //brain[0][0] = "Roland";
    
    }
    //public static void brain(int num1, int num2){
    // String [] [] brain = new String [20] [2];   
     //brain[0][0] = "fart";
    
    //}
    public String answer(String A1, String A2, String A3)
    {
        String answer = "";
        //calls to the method that returns the answer 
        //with the highest correlation
        return answer;
    }
    public String WordSelecter(String sentence){
    //picks apart the sentence word by word
    //take in past information to change the
    //words it chooses to search
    String word = "";
    return word;
    }
    public double correlation(String word, String A){
    double correlation = 0;    
        
        
        
        
    return correlation;
    }
    public static void searchWord(String question, String A){
    //disect the question    
    //record a new word
    //update a stat for usefulness of the word in searching    
    //    
        
    }
    //method that fills a brain
    public static void fillbrain(){
    brain[0][0] = "Roland";    
          
    }
    public static double stats(String word){
    //ArrayList<String> vocab = new ArrayList<String>(1); 
    //ArrayList<Integer> numbers = new ArrayList<Integer>(1);
     boolean newWord = true;
     double stat = 0;
     int start = 0;
     int end = 0;
    //checks if word is in its vocab 
     for(int i = 0; i < vocab.size();i++){
      if(word.equals(vocab.get(i))){
      i = vocab.size();
      newWord = false;
    }
        }
    //adds a new word to vocab    
     if(newWord == true){
     vocab.add(word);
     numbers.add(100.00);    
    }
    //calculates the stat correlation
   for(int j = 0; j < brain.length; j++){
  if(word.equals(brain[j][0]))     
  for(int c = 0; c < brain[j][1].length();c++){
  if(A.equals(brain[j][1].substring(start,end)))
  stat = stat + 2.5;
  }
       
  }

    
    
    return stat;
    }
    public static void main(){    
    Scanner in = new Scanner(System.in);
    //String question = "";
    //question = in.next();
    String intro = "Hello my name is TBD. I am an AI that can answer trivia questions using my big brain."; 
    System.out.println(intro);    
    //AI mag = new AI();
    //System.out.println(mag);
    fillbrain();
    System.out.println(stats("cheese"));
    System.out.println(stats("pie"));
    System.out.println(stats("cheese"));
    for(int b = 0; b < vocab.size();b++){
    System.out.println(vocab.get(b) + numbers.get(b));       
    }
    System.out.println(brain[0][0]);
    }
}
