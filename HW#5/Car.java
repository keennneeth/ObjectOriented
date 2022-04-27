public class Car implements CarbonFootprint
 {
    
    int Miles;
    float Gas;
   
    Car(int m, float g)
    {
        Miles = m;
        Gas = g;
    }
   
    public void getCarbonFootprint()
    {
        float CarCarbonFootprint = Miles*Gas;
        System.out.println("The Carbon footprint of a car is: " + CarCarbonFootprint);
    }
 
 }
