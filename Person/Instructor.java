
/**
 * Instructor returns the salary of an instructor
 * 
 * @author (Shiven Gupta)
 */
public class Instructor extends Person
{
    // Instance variables
    private double salary;

    /**
     * Constructor for objects of class Instructor
     * @param name name of the instructor
     * @param birthYear year of birth of the instructor
     * @param salary salary of the teacher
     * (Precondition: name.length() > 0)
     * (Precondition: birthYear > 0)
     * (Precondition: salary > 0)
     */
    public Instructor(String name, int birthYear, double salary)
    {
        //Initializing instance variables
        super(name, birthYear);
        this.salary = salary;
    }

    /**
     * Represents an object as a String
     * @return a new representation of the String
     */
    public String toString() {
        return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
    }
}
