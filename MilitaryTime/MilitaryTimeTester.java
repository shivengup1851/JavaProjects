import java.util.Scanner;
/**
 * MilitaryTimeTester tests the MilitaryTime class
 * 
 * @author (Shiven Gupta)
 */
public class MilitaryTimeTester
{
    public static void main (String[] args) {
        //Created Scanner
        Scanner scan = new Scanner(System.in);
        //Allows user to type first time
        System.out.println("Please enter the first time in military time (hour minute):");
        int x = scan.nextInt();
        int y = scan.nextInt();
        MilitaryTime milli = new MilitaryTime(x, y);
        //Allows user to type second time
        System.out.println("Please enter the second time in military time (hour minute):");
        int w = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(milli.compareWith(w, z));
        //Lets the user know when the process has ended
        System.out.println("\nProcess completed.");
    }
}
