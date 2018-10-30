
public class InsufficientWithdrawException extends RuntimeException
{
    public InsufficientWithdrawException() {}
    
    public InsufficientWithdrawException(String message) {
        
        super(message);
    }
}