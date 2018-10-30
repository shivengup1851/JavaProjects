
//Shiven Gupta
/**
 * The RationalNumber returns a fraction after setting the numerator and denominator
 */
public class RationalNumber {

    //I created my instance variables
    private int num;
    private int den;

    /**
     * Initializes the instance variables
     */
    public RationalNumber(int numerator, int denominator) {
        
        //I initialized my instance variables
        num = numerator;
        den = denominator;
    }
    
    /**
     * Sets the numerator to 0 and the denominator to 1
     */
    public RationalNumber() {

        //I set the ratio to 0/1
        num = 0;
        den = 1;
    }
    /**
     * Gets the numerator value
     * @return the value of the numerator
     */
    public int getNumerator() {
        
        return num;
    }
    /**
     * Gets the denominator value
     * @return the value of the denominator
     */
    public int getDenominator() {
        
        return den;
    }
    /**
     * Sets the numerator to the value given
     * @param numerator value 
     */
    public void setNumerator(int topValue) {
        
        num = topValue;
    }
    /**
     * Sets the denominator to the value given
     * @param denominator value
     */
    public void setDenominator(int bottomValue) {
        
        den = bottomValue;
    }
    /**
     *Changes the form of the return value to a String
     *@return numerator divided by denominator in a String form
     */
    public String toString() {
        
        return num + "/" + den;
    }
}