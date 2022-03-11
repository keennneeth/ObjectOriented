
public class CreateAccount
{

private String FirstName;
private String LastName;
private String Username;
private String Password;
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

public String GetUsername()
{
return Username;

}

public void setUsername(String Username)
{

this.Username = Username;

}

public String password()
{
return Password;

}

public void setPassword(String Password)
{

this.Password = Password;

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

return "\nFirst name: " + FirstName + "\nLast Name: " + LastName + "\nUsername: " + Username + "\nAddress: " + Address + "\nCredit Card: " + CreditCard ;

}


}

