import java.util.Scanner;
/**
 * StringPrinter prints a string backwards
 * 
 * @author (Shiven Gupta);
 */
public class StringPrinter
{
    public static void main (String args[]) {
        //Created scanner allowing for user input
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String x = scan.nextLine();
        //created integer which holds length of string
        int len = x.length();
        //created the output string which will hold the output
        String output = "";
        //initialized i to 0
        int i = 0;
        for (i = len - 1; i >= 0; i--) {
            //will make output a collection of the characters in reverse order
            output += x.charAt(i);
        
        }
        //If the word is the same backwards, I tell the user the word is the same 
        if (x.equals(output)) {
        	System.out.println("THIS WORD IS THE SAME BACKWARDS!");
        }
        else {
        System.out.println(output);
        }
      }
    }

    
         
