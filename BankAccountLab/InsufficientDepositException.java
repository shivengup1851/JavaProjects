
public class InsufficientDepositException extends RuntimeException
{
    public InsufficientDepositException() {}
    
    public InsufficientDepositException(String message) {
        
        super(message);
    }
}