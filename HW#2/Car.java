
public class Car 
{

String Make;
String Model;
int Year;

public Car(String mk, String mod, int yr)
{
this.Make = mk;
this.Model = mod;
this.Year = yr;
}
public Car()
{
    this.Make = "Ford";
    this.Model = "Explorer";
    this.Year = 2000; 
}
public void show()
{
    System.out.println("Make: " + Make);
    System.out.println("Model: " + Model);
    System.out.println("Year: " + Year);
}
}



