import java.util.Scanner;

public class CarpetCostTest 
{
    
public static void main (String[] args)
{
double price = 8.0;
double length;
double width;

RoomDimension dim;
RoomCarpet cost;

Scanner input = new Scanner(System.in);

System.out.println("Enter Room Length: ");
length = input.nextDouble();

System.out.println("Enter Room Width: ");
width = input.nextDouble();

dim = new RoomDimension(length, width);
cost = new RoomCarpet(dim, price);

System.out.println(cost);


}

}
