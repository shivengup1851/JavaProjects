/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   /**
      Constructs a bank account with a zero balance
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      if(initialBalance >= 0)
        balance = initialBalance;
      else
            throw new InsufficientBalanceException("Initial Balance is not greater than 0");
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      if(amount >= 0) {
      double newBalance = balance + amount;
      balance = newBalance;
    }
    else {
        throw new InsufficientDepositException("You must deposit a positive amount");
    }
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      if(amount > 0 && amount < balance) {
      double newBalance = balance - amount;
      balance = newBalance;
    }
    else {
        throw new InsufficientWithdrawException("You must withdraw a positive amount that is less that the current balance");
    }
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

   private double balance;
}