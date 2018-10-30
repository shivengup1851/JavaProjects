
/**
 * Write a description of class Worker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Worker
{
    private String name;
    private double salaryRate;
    /**
     * Constructor for objects of class Worker
     */
    public Worker(String personName, double salary)
    {
        name = personName;
        salaryRate = salary;
    }
    public abstract double computePay(int hours);
    public double getRate() {
        return salaryRate;
    }
}
