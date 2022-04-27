public class Yacht implements Ship
{
private String Yachtname;
private int Year;
private String owner;  



public Yacht(String Yachtname, int Year, String owner)
{

this.Yachtname = Yachtname;
this.Year = Year;
this.owner = owner;


}

public String getName()
{

    return Yachtname;
}

public void setName(String Yachtname)
{

    this.Yachtname = Yachtname;
}


public int getYear()
{

    return Year;
}

public void setYear(int Year)
{

    this.Year = Year;
}


public String getOwner()
{
return owner;
}

public void setOwner(String owner)
{

    this.owner = owner;
}

public void describeShip()
{
System.out.println("The Yacht name is "+Yachtname+", The year it was built was in "+ Year +", and the owner is "+ owner);

}
}
