public class CargoShip extends Ship
 {
    int CargoCapacityTon;

    public CargoShip(String name, int year, int CargoCapacityTon) {
        super(name, year);
        this.CargoCapacityTon = CargoCapacityTon;
 
    }
 
    public int getCargoCapacity() {
 
        return CargoCapacityTon;
    }
 
    public String toString() {
 
        return "The ship name is: "+getShipname()+" - Cargo Capcity in Tons: "+getCargoCapacity();
 
    }
 }
    

