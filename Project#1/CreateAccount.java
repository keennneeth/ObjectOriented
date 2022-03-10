
public class CreateAccount
{

private String FirstName;
private String LastName;
private String Address;
private String CreditCard;

public String GetFirstName()
{
    return FirstName;
}

public void setFirstName(String FirstName)
{
this.FirstName = FirstName;

}

public String GetLastName()
{
return LastName;
}

public void setLastName(String LastName)
{

   this.LastName = LastName;
}


public String GetAddress()
{

return Address;

}

public void SetAddress(String Address)
{

    this.Address = Address;
}

public String GetCreditCard()
{

return CreditCard;

}

public void setCreditCard(String CreditCard)
{

    this.CreditCard = CreditCard;
}

public String toString()
{

return "First name: " + FirstName + "\nLast Name: " + LastName + "\nAddress: " + Address + "\nCredit Card: " + CreditCard ;

}


}

