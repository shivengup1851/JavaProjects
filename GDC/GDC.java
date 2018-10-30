
/**
 * GDC finds the greatest common divisor
 * 
 * @author (Shiven Gupta)
 */
public class GDC
{
    private int num1;
    private int num2;
    
    public GDC (int number1, int number2) {
        
        num1 = number1;
        num2 = number2;
        
    }
    
    public void findGCD() {
        int a = 0;
        int b = 0;
        
        if (num1 < num2)
            a = num1;
        else 
            a = num2;
        for (i = 0; i <= a; i++) { 
            if (num1 == 0 && num2 == 0)
                b = i;
        }
        return b;
     }
}
