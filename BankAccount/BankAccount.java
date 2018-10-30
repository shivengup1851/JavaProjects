/**
    A bank account has a balance that can be changed by
    deposits and withdrawals.
*/
public class BankAccount implements Comparable
{

    /**
        Constructs a bank account with a zero balance.
    */
    public BankAccount()
    {
        balance = 0;
    }

    /**
        Constructs a bank account with a given balance.
        @param initialBalance the initial balance
    */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
        Deposits money into the bank account.
        @param amount the amount to deposit
    */
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    /**
        Withdraws money from the bank account.
        @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    /**
        Gets the current balance of the bank account.
        @return the current balance
    */
    public double getBalance()
    {
        return balance;
    }
    /**
     * Compares the balances of bank accounts
     * 
     * @param bank a bank account
     * (Postcondition: how the first bank account compares to the second.)
     */
    public String compareTo(BankAccount bank)
    {
        if (bank.getBalance() > balance)
            return "The 1st account has less money.";
        if (bank.getBalance() < balance)
            return "The 1st account has more money.";
        return "Both accounts have the same amount of money.";
    }
    
    private double balance;
 }