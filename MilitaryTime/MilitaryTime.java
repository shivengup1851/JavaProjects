
/**
 * MilitaryTime compares two military times
 * 
 * @author (Shiven Gupta) 
 */
public class MilitaryTime
{
   //Instance variables
   private int h;
   private int m;
   /**
    * Constructor to initialize instance variables
    * @param h hours in military time
    * @param m minutes
    */
   public MilitaryTime(int h, int m)
   {
       //Initialized instance variables
       this.h = h;
       this.m = m;
  
   }
   /**
    * Compares two times and returns an output based on a certain situation
    * @param hr hours
    * @param min minutes
    */
   public String compareWith(int hr, int min)
   {
       //Created local variables
       String string1 = h + ":" + m;
       String string2 = hr + ":" + min;
       //Returns statements based on situations
       if(string1.compareTo(string2) < 0)
        return "The time entered is after";
       else if(string1.compareTo(string2) > 0)
        return "The time entered is before";
       else if(string1.compareTo(string2) == 0)
        return "The time entered is the same";
      else {
          return null;  
           }
   }
}

