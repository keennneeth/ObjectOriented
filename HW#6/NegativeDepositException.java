public class NegativeDepositException extends Exception
{

    public NegativeDepositException()
    {
super("Amount has to be positive");


    }
public NegativeDepositException(double money)
{

    super("Amount has to be positive: "+money);
}


}
