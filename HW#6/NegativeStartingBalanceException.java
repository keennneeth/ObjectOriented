public class NegativeStartingBalanceException extends Exception

{
    
public NegativeStartingBalanceException()
{

    super("Amount exceeds balance");
}
public NegativeStartingBalanceException(double money)
{

    super("Amount exceeds balance "+money);
}


}
