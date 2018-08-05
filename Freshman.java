
/**
 * Write a description of class EighthGraders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Freshman extends Student
{
    private double hoursOfHomework = 0;
    private boolean newFriends = false;

    public Freshman()
    {
        super("Smith, John", 9);
        hoursOfHomework = 0;
        newFriends = false;
    }

    public Freshman(String bell, int g)
    {
        super(bell, g);
        hoursOfHomework = 0;
        newFriends = false;

    }

    public Freshman(String bell)
    {
        super(bell);
        hoursOfHomework = 0;
        newFriends = false;

    }

    public Freshman(String bell, String[] classes)
    {
        super(bell, classes);
        hoursOfHomework = 0;
        newFriends = false;

    }

    public Freshman(String bell, int gr, String[] classes)
    {
        super(bell,gr,classes);
        hoursOfHomework = 0;
        newFriends = false;

    }

    public void goToSchool()
    {
        String [] currentClasses= this.getSchedule();

        for(int i = 0; i < getSchedule().length; i++){ 
            if(currentClasses[i].substring(0,2).equals("AP")){
                changeStress(5);
                homework(1);
            }
            else if (currentClasses[i].substring(0,2).equals("CP")){
                changeStress(1);
                homework(.5);
            }
        }

        lunch();

        learn(1);
        
        if(hoursOfHomework < 0){
            hoursOfHomework = 0;
        }
    }

    public void homework(double hours){
        hoursOfHomework = hoursOfHomework + hours;

        //System.out.println("Hours of Homework: " + hoursOfHomework);

        if(hoursOfHomework > 10){
            changeStress(20);
        }
    }

    public double getHomework(){
        return hoursOfHomework;
    }

    public void newFriends(){
        double Friends = Math.random();

        if(Friends>=0.5)
            newFriends=true;
        else
            newFriends=false;

        System.out.println("New friends: " + newFriends);
    }

    public boolean getNewFriends(){
        return newFriends;
    }

    public void lunch(){
        changeStress(-1);
        homework(-1);
        if(hoursOfHomework < 0){
            hoursOfHomework = 0;
        }
    }

    public void dayOff(){
        homework(-1 * (int)(Math.random() * 6 + 1));
        changeStress(-20);
        if(hoursOfHomework < 0){
            hoursOfHomework = 0;
        }
    }

    public String toString()
    {
        //name, grade and other identifying info.
        return super.toString() + " Hours of Homework: " + getHomework() + " New Friends: " + getNewFriends();

    } 
}


