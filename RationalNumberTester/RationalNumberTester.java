//Shiven Gupta
public class RationalNumberTester {
    public static void main(String[] args) {
        //Creats object variables
        RationalNumber x = new RationalNumber(5,2);
        RationalNumber y = new RationalNumber();
        
        //Prints the numerators and denominators
        System.out.println("Parameterized numerator: " + x.getNumerator());
        System.out.println("Default numerator: " + y.getNumerator());
        System.out.println("Parameterized denominator: " + x.getDenominator());
        System.out.println("Default denominator: " + y.getDenominator());
        
        //Sets the numerator and denominator of x to 50 and 100
        x.setNumerator(50);
        x.setDenominator(100);
        
        //Prints the new numerator and denominator
        System.out.println("New Parameterized numerator: " + x.getNumerator());
        System.out.println("New Parameterized denominator: " + x.getDenominator());
        
        //Prints the object
        System.out.println(x);
        
    }
}
        
  