import java.util.Scanner;
/**
 * Write a description of class DataSetTester here.
 * 
 * @author (Shiven Gupta) 
 */
public class DataSetTester
{
    public static void main(String[] args) {
        //Created new object
        DataSet x = new DataSet();
        //Created scanner object o add user input
        Scanner scan = new Scanner(System.in);
        //Prints the inputs of the user
        System.out.print("Enter Student Scores, -999 to quit: ");
        //Scans each input
        int num = scan.nextInt();
        //Scans the user's inputs while -999 is not typed
        while (num != -999) {
            x.add(num);
            num = scan.nextInt(); 
        }
        //Prints the average of the user's inputs after -999 is typed
        System.out.println("Average of Scores Entered: " + x.averageScore());
        //Ends the scanner
        scan.close();
    }
    
}
