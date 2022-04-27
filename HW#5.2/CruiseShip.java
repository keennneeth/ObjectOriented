import java.util.ArrayList;
import java.util.Arrays;

public class CruiseShip implements Ship
{

   private String CruiseshipName;
   private String City[];
   private int MaxPassenger; 



   public CruiseShip(String CruiseshipName, String[] City, int MaxPassenger)
   {
    this.CruiseshipName = CruiseshipName;
    this.City = City;
    this.MaxPassenger = MaxPassenger;

   }

   public String getName()
   {
return CruiseshipName;

   }

   public void setName(String CruiseshipName)
   {
this.CruiseshipName = CruiseshipName;

   }

   public String[] getCity()
   {
return City;

   }

   public void setCity(String[] City)
   {
this.City = City;

   }

   public int GetMaxPassenger()
   {

    return MaxPassenger;
   }

   public void SetMaxPassenger(int MaxPassenger)
   {

    this.MaxPassenger = MaxPassenger;
   }

   
public void describeShip()
{
System.out.println("The cruise ship name is "+CruiseshipName+", The cities it visited is "+ Arrays.toString(City) +", and the max # of passengers is "+ MaxPassenger);

}
}
