
/**
 * RandomDataAnalyzer finds the sum and average of 25 numbers
 * 
 * @author (Shiven Gupta) 
 */
public class RandomDataAnalyzer
{
    public static void main (String args[]) {
        //created and initialized variables
        int sum = 0;
        double count = 0.0;
        //prints 25 random numbers from 0 ot 100
        for (int i = 1; i < 26; i++) {
            int x = ((int) (Math.random() * 101));
            //if number is 50, only print. If it is not 50, find sum and increase count
            if (x != 50) {
                sum += x;
                count++;
            }
            System.out.print(x + " ");
        }
        //prints the sum and average of digits
        System.out.println("\nSum of digits: " + sum);
        System.out.println("Average of digits: " + sum / count);
   }
    
 }
