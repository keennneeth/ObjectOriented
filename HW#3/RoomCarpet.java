class RoomCarpet
{

    RoomDimension size;
    double carpetCost;


    public RoomCarpet(RoomDimension dim, double cost)
    {

size = new RoomDimension(dim.GetLength(), dim.GetWidth());
carpetCost = cost;

    }

public double getTotalCost()
{
return carpetCost;
}

public String toString()
{
String output = size + "The carpet cost is $" + carpetCost*size.GetArea();
return output;

}
}
