import java.util.*;


public class Test {
    
    public static void main(String args[])
    {
        ArrayList<CarbonFootprint> CarbonFootprint1 = new ArrayList<CarbonFootprint>();
        Building newb = new Building(10,6.475f);
        Car newc = new Car(300,4.50f);
        Bicycle newBicycle = new Bicycle();
        CarbonFootprint1.add(newb);
        CarbonFootprint1.add(newc);
        CarbonFootprint1.add(newBicycle);
       
        Iterator<CarbonFootprint> itr = CarbonFootprint1.iterator();
        while(itr.hasNext()){
            itr.next().getCarbonFootprint();
        }
    }
 }
