public class CargoShip implements Ship 
{

private String CargoshipName;
private int Capacity;
private String Departure;  
private String Destination;  



public CargoShip(String CargoshipName, int Capacity, String Departure, String Destination)
{
this.CargoshipName = CargoshipName;
this.Capacity = Capacity;
this.Departure = Departure;
this.Destination = Destination;


}

public String getName()
{

    return CargoshipName;
}

public void setName(String CargoshipName)
{

    this.CargoshipName = CargoshipName;
}


public int getCapacity()
{

    return Capacity;
}

public void setCapacity(int Capacity)
{

    this.Capacity = Capacity;
}


public String getDeparture()
{
return Departure;
}

public void setDeparture(String Departure)
{

    this.Departure = Departure;
}

public String getDestination()
{
return Destination;
}

public void setDestination(String Destination)
{

    this.Destination = Destination;
}




public void describeShip()
{
System.out.println("The Cargo ship name is "+CargoshipName+", The capacity is "+ Capacity +", It will depart from "+ Departure + ", and the destination is "+ Destination);

}
}


