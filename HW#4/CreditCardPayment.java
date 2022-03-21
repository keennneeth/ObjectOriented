class CreditCardPayment extends Payment
{
private String name;
private String expiration;
private String creditcard;

public CreditCardPayment()
{
    super();
    name = " ";
     expiration = " ";
      creditcard = "";

}


public CreditCardPayment(double amt, String name, String expiration, String creditcard)
{
super(amt);
this.name = name;
this.expiration = expiration;
this.creditcard = creditcard;

}

public void paymentDetails()
{
System.out.println("The credit card payment amount is $" + getPayment());
System.out.println("The name on the card is: " + name);
System.out.println("The expiration date is: " + expiration);
System.out.println("The credit card number is: " + creditcard);


}
    
}
