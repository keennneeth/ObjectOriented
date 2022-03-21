import java.util.ArrayList;
import java.util.List;

public class ShipTest 
{
    public static void main(String[] args)
    {
        ArrayList<Ship> Ships = new ArrayList<>();
        Ships.add(new Ship("Titanic",1909));
        Ships.add(new CruiseShip("Bermuda",0,  1500));
        Ships.add(new CargoShip("Capsule",0,  750));
 
         for (Ship s : Ships) {
            System.out.println(s.toString());
        }
    }
 
 }
