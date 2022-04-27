public class WithdrawExceedBalanceException extends Exception
{
public WithdrawExceedBalanceException()
{
super("Withdraw amount has to be positive");

}
    public WithdrawExceedBalanceException(double money)
    {
super("Amount has to be positive: "+money);

    }

}
