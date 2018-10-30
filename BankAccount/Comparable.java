
/**
 * Holds the abstract methods for the BankAccount class
 * 
 * @author (Shiven Gupta)
 */
public interface Comparable
{
    /**
     * Compares the balances of bank accounts
     * 
     * @param bank a bank account
     * (Postcondition: how the first bank account compares to the second.)
     */
    String compareTo(BankAccount bank);
}
