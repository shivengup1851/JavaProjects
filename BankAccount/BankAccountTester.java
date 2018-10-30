
/**
 * Tests the BankAccount class
 * 
 * @author (Shiven Gupta)
 */
public class BankAccountTester
{
    public static void main(String[] args) {
    BankAccount one = new BankAccount(1000);
    BankAccount two = new BankAccount(1000);
    BankAccount three = new BankAccount(500);
    
    System.out.println(three.compareTo(two));
    System.out.println(one.compareTo(three));
    System.out.println(one.compareTo(two));
  }
}