import java.util.Scanner;



public class CarTest 

{
    public static void main (String[] args)
    {

Car car1 = new Car("Subaru", "WRX", 2017);
Car car2 = new Car("Ford", "Explorer", 2000);
System.out.println("Car 1");
car1.show();
System.out.println("______________");
System.out.println("Car 2");
car2.show();
    }
}
