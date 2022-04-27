
public class Building implements CarbonFootprint
{
    int Height;
    float Gas;
   
    Building(int n, float g)
    {
        Height = n;
        Gas = g;
    }
   
    public void getCarbonFootprint()
    {
        double BuildingCarbonfootprint = Height*Gas;
        System.out.println("The carbon footprint of a building is: " + BuildingCarbonfootprint);
    }
 
 }