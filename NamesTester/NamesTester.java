import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class NamesTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NamesTester
{
    public static void main (String[] args) {
        String[] x = new String[100];
        ArrayList<String> names = new ArrayList<String>();
        int count = 0;
        System.out.println("You can only input a maximum of 100 names!");  
        System.out.println("Type STOP when finished adding names.");  
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter names: ");
        String input = scan.next();
        while (input.equals("STOP")) {
            names.add(input);
            count++;
            x[count] = input;
            input = scan.next();
        }
        for (int i = 0; i < count; i++) {
            System.out.print("Names in the array are: " + x[i]);
            System.out.println("\nNames in the array list are: " + names);
            System.out.println("\nThe array has " + x.length + " names.");
            System.out.println("The array list has " + names.size() + " names.");
            System.out.println("\nArray 1st and last name: " + x[0] + ", " + x[x.length - 1]);
            System.out.println("Array list 1st and last name: " + names.get(0) + ", " + names.get(names.size() - 1));
            
           }
    }
}