
/**
 * Separator prints an integer's values in reverse order
 * 
 * @author (Shiven Gupta)
 */
public class Separator
{
  //Created instance variable
  private int integer;
  /**
   * Constructor to initialize instance variables
   * @param integer the integer used
   */
  public Separator(int integer) {
      //Initialized the instance variable
      this.integer = integer;
    }
    /**
     * Returns the number in the ones place of an integer
     * @return the number in the ones place of the integer
     */
  public int returnFirst() {
      int numbers = integer % 10;
      integer = integer/10;
      return numbers;
    }
}
