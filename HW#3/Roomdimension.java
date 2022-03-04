class RoomDimension 

{
    public double length;
    public double width;
    public String output;



public RoomDimension(double l, double w)
{
length = l;
width = w;
}

public double GetLength()
{
    return length;
}

public double GetWidth()
{
    return width;
}

public double GetArea()
{
return length*width;
}

public String toString()
{

output = "The length of the room is " + length + " and the width is " + width
+ ", the total area is " + GetArea();
return output;


}


}
