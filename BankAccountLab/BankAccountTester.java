
public class BankAccountTester 
{
    public static void main (String[] args) throws Throwable {
        BankAccount x = new BankAccount(1000);
        try {
            x = new BankAccount(-100);
        }
        catch (InsufficientBalanceException exception){
            System.out.println(exception.getMessage());
        }
        try{
            x.deposit(-30);
        }
        catch (InsufficientDepositException exception1) {
            System.out.println(exception1.getMessage());
        }
        try{
            x.withdraw(-30);
        }
        catch (InsufficientWithdrawException exception2) {
     		System.out.println(exception2.getMessage());
     		try {
     			x.withdraw(20);
     		}
     		catch (InsufficientWithdrawException exception3){
     			exception3.printStackTrace();
     		}

        }
    }

    
}
