
/**
 * Write a description of class Pets here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pets//dog
{
    // instance variables 
    private int age;
    private String name;
    /**
     * Constructor for objects of class Pets
     */
    public Pets()
    {
        // initialise instance variables
        age = 1;
        name = "Joe";
    }

    /**
     * Constructor for objects of class Pets
     */
    public Pets(int ages)
    {
        // initialise instance variables
        age = ages;
        name = "Bob";
    }

    /**
     * Constructor for objects of class Pets
     */
    public Pets(int ages, String names)
    {
        // initialise instance variables
        age = ages;
        name = names;
    }

    public int Ages(){    
    return age;    
    }
      public String Names(){    
    return name;    
    }
    
    public String speak(){
        return "bark"; 
    }

    public String doTricks(){
        //random number is generated       
        int random = (int)(Math.random()*5);
        //loop runs through until i is equal to random number.               

        String trick1 = "catch";   
        String trick2 = "RollerOver";    
        String trick3 = "jump";   
        String trick4 = "sit";    
        String trick5 = "speak english";     

        if (random == 0)
            return  trick1;
        if (random == 1)
            return  trick2;  
        if (random == 2)
            return  trick3;  
        if (random == 3)
            return  trick4; 
        if (random == 4)
            return  trick5;  

        return "error";
    }   

    public void aged(int num){    
        age = num + age;  
    }
}
