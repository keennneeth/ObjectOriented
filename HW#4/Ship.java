public class Ship
 {

    String ship;
    int year;
public Ship(String ship, int year)
{

    this.ship=ship;
    this.year=year;

}

public String getShipname()
{
return ship;
}

public int GetShipYear()
{
return year;
}

public String toString()
{
return "The Ship name is: "+getShipname()+" - Year it was built: "+GetShipYear();
}
}
