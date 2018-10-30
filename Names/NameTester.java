import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
/**
 * @author (Shiven Gupta)
 */
public class NameTester
{
    public static void main (String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Boy Names File: ");
        String namesboys = new String(in.nextLine());
        System.out.println("Girl Names File: ");
        String namesgirls = new String(in.nextLine());
        System.out.println("Names File: ");
        String names = new String(in.nextLine());
       
       boolean done = false;
       FileReader reader1 = null;
       while(done == false)  {
           int counter = 0;
       try{
        reader1 = new FileReader(namesboys);
       }
       catch(FileNotFoundException x) {
           counter++;
           if(counter == 3) 
           throw x;
           else
           System.out.println("The file is not found.");

       }
       done = true;
    }
        done = false;
        FileReader reader2 = null;
       while(done == false)  {
           int counter = 0;
       try{
        reader2 = new FileReader(namesgirls);
       }
       catch(FileNotFoundException y) {
           counter++;
           if(counter == 3) 
           throw y;
           else
           System.out.println("The file is not found.");

       }
       done = true;
    }
        Scanner scan1 = new Scanner(reader1);
        Scanner scan2 = new Scanner(reader2);
        PrintWriter out = new PrintWriter(names);
        int lineNumber = 1;
        out.println("Boy Names");
        while (scan1.hasNextLine()) {
            out.println(lineNumber + ". " + scan1.nextLine());
            lineNumber++;
        }
        lineNumber = 1;
        out.println("\nGirls Names");
        while (scan2.hasNextLine()) {
            out.println(lineNumber + ". " + scan2.nextLine());
            lineNumber++;
        }
        
        in.close();
        scan1.close();
        scan2.close();
        out.close();
    }
}
