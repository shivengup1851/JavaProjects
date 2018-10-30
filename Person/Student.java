
/**
 * Student returns the major of a student
 * 
 * @author (Shiven Gupta)
 */
public class Student extends Person
{
    //Instnace variables
    private String major;

    /**
     * Constructor for objects of class Student
     * @param name name of the person
     * @param birthYear year of birth of the person
     * @param major major of the student
     * (Precondition: name.length() > 0)
     * (Precondition: birthYear > 0)
     * (Precondition: major.length() > 0)
     */
    public Student(String name, int birthYear, String major){
        //Initializing instance variables
        super(name, birthYear);
        this.major = major;
    }

    /**
     * Represents an object as a String
     * @return a new representation of the String
     */
    public String toString(){
        return "Student[super=" + super.toString() + ",major=" + major + "]";
    }
}
