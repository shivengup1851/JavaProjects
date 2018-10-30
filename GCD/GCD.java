
/**
 * GCD finds the greatest common divisor
 * 
 * @author (Shiven Gupta)
 */
public class GCD
{
    //Instance variables
    private int num1;
    private int num2;
    /**
     * Constructor to initialize the instance variables
     * @param number1 the first number
     * @param number2 the second number
     */
    public GCD (int number1, int number2) {
        //Instance variables initialized
        num1 = number1;
        num2 = number2;
        
    }
    /**
     * Finds the greatest common divisor amongst the two numbers provided
     * @return the greatest common divisor
     */
    public int findGCD() {
        int a = 0;
        int b = 0;
        //Makes a the smallest number
        if (num1 < num2)
            a = num1;
        else 
            a = num2;
        //Finds the greatest common divisor until the smallest number is reached
        for (int i = 1; i <= a; i++) { 
            if (num1 % i == 0 && num2 % i == 0)
                b = i;
        }
        return b;
     }
}
