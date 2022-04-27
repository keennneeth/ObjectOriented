public class ShipTest  

{
public static void main(String[] args)
{
Yacht NewYacht = new Yacht("Rover", 2005, "Niko");
CruiseShip NewCruiseShip = new CruiseShip("Cooper",new String[]{"Miami", "Galveston"}, 450 );
CargoShip NewCargoship = new CargoShip("Ricky", 4000, "Gulf of Mexico", "Corpus Christi");


Ship ships[]={NewYacht, NewCruiseShip, NewCargoship};
  
for(Ship ship:ships)
{
    ship.describeShip();
}

}

}
