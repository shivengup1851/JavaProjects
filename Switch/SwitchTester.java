import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class SwitchTester here.
 * 
 * @author (Shiven Gupta) 
 */
public class SwitchTester
{
    public static void main(String args[]) {
        //Created array list
        ArrayList <String> names = new ArrayList <String>(); 
        //Added strings
        names.add("Morning");
        names.add("Good");
        names.add("Computer Science");
        names.add("AP");
        //Prints original array list and modified array list
        System.out.println("Original Array List: \n" + names);
        System.out.println("Switched Array List: \n" + Switch.switchTwo(names));
    }
    }