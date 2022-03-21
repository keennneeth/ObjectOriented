public class CashPayment extends Payment

{
public CashPayment()
{

    super();
}

public CashPayment(double amt)
{

    super(amt);
}
public void paymentDetails()
{

    System.out.println("The cash payment amount is "+getPayment());
}

    
}
