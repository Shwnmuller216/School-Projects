
/**
 * Student class
 *
 * @author Bell
 * @version 2/10/2018
 */
public class Student implements Measurable
{
   //Instance Variables
   private String name;
   private int grade;
   private double gpa;
   private int stressLevel;
   private String[] schedule;
   
   //Constructors
   public Student()
   {
       name = "Smith, John";
       grade = 9;
       gpa = 0;
       stressLevel = 0;
       schedule = new String []{"English","Math", "Physical Education", "Science", "History", "Freshman Seminar", "Foreign Language", "Web Design I"};
   }
   public Student(String bell)
   {
       name = bell;
       grade = 9;
       gpa = 0;
       stressLevel = 0;
       schedule = new String []{"English","Math", "Physical Education", "Science", "History", "Freshman Seminar", "Foreign Language", "Web Design I"};
   }
   public Student(String bell, int g)
   {
       name = bell;
       grade = g;
       gpa = 0;
       stressLevel = 0;
       schedule = new String []{"English","Math", "Physical Education", "Science", "History", "Freshman Seminar", "Foreign Language", "Web Design I"};
   }
   
   
   public Student(String bell, String[] classes)
   {
       name = bell;
       grade = 9;
       gpa = 0;
       stressLevel = 0;
       schedule = classes;
   }
   
   public Student(String bell, int gr, String[] classes)
   {
       name = bell;
       grade = gr;
       gpa = 0;
       stressLevel = 0;
       schedule = classes;
   }
   
   
   
   //Methods - Accessors
   public String getName()
   {
    return name;   
   }
   public int getGrade()
   {
    return grade;   
   } 
    public double getMeasure()
   {
    return Math.round(gpa * 100)/100.0;   
   }
   public int getStressLevel()
   {
    return stressLevel;   
   } 
   public String[] getSchedule()
   {
    return schedule;   
   } 
   
   //Methods - Mutators
   public void learn(double val)
   {
      gpa += val; 
      if (gpa > 5.0)
        gpa = 5.0;
      else if (gpa < 0)
        gpa = 0;
   }
   
   public void goToSchool()
   {
       for (int i = 0; i < schedule.length; i++){
          learn(0.1);
          stressLevel += 1;
        }
       while (stressLevel > 100)
         changeStress(-1);
   }
   public void changeStress(int val)
   {
       stressLevel += val;
   }
   
   
   public void dayOff()
   {
       int num = (int)(Math.random()*6);
       for (int i = 0; i < num; i++){
          learn(-0.1);
          stressLevel--;
        }
        if (stressLevel < 0)
         stressLevel = 0;
        
   }
   
   
   //toString method - inhereted from the object class
   public String toString()
   {
       //name, grade and other identifying info.
       return getName() + " Grade: " + getGrade() + " GPA: " + getMeasure() + " Stress Level: " + getStressLevel();
           
       //return super.toString() + 
    }
}

