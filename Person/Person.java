
/**
 * Person returns the name of a person and a year of birth
 * 
 * @author (Shiven Gupta)
 */
public class Person
{
    //Instance variables
    private String name;
    private int birthYear;
    /**
     * Constructor for objects of class Person
     * @param name name of the person
     * @param birthYear year of birth of the person
     * (Precondition: name.length() > 0)
     * (Precondition: birthYear > 0)
     */
    public Person(String name, int birthYear) {
        //Initializing instance variables
        this.name = name;
        this.birthYear = birthYear;
        
    }
    /**
     * Represents an object as a String
     * @return a new representation of the String
     */
    public String toString() {
        return "Person[name=" + name + ",birthYear=" + birthYear + "]";
    }
}
