class CruiseShip extends Ship
{
    int MaxPassengers;

    public CruiseShip(String name, int year, int MaxPassengers)
    {
        super (name, year);
        this.MaxPassengers = MaxPassengers;
    }

    public int GetMaxPassengers()
    {
        return MaxPassengers;
    }

    public String toString()
    {

        return "The ship name is: "+getShipname()+" - Max Capacity: "+GetMaxPassengers();
    }
}
