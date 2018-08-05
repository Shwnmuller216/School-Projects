public class DataSet {
    private double sum; 
    private Measurable maximum; 
    private int count;  

    public DataSet() 
    {
        sum = 0;
        maximum = null;
        count = 0;
    }
    
    public void add(Measurable x)
    {   
        sum = sum + x.getMeasure();   
        if (count == 0 || maximum.getMeasure() < x.getMeasure())
            maximum = x;  
        count++;
    }

    public Measurable getMaximum()  
    {   
        return maximum; 
    }
    
    //Missing getAverage() method
    public double getAverage(){
    return sum/count;
    }

}