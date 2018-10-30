
/**
 * Write a description of class HourlyWorker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HourlyWorker extends Worker
{
   
    /**
     * Constructor for objects of class HourlyWorker
     */
    public HourlyWorker(String name, double salary)
    {
        super(name,salary);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double computePay(int hours)
    {
        if(hours > 40) {
            return ((hours - 40) * 1.5 * super.getRate()) + (40 * super.getRate());
            
            
        }
    }
}
