import java.util.Scanner;

public class GeometryTest
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

System.out.println("Geometry Calculator");
System.out.println("1. Calculate the Area of a Circle");
System.out.println("2. Calculate the Area of a Rectangle");
System.out.println("3. Calculate the Area of a Triangle");
System.out.println("4. Quit");
System.out.println("Enter your choice (1-4):");
int choice = input.nextInt();



Geometry math = new Geometry();

        switch (choice)
        {
case 1:
System.out.println("Enter the radius of your circle: ");
double r = input.nextDouble();
System.out.println("Your area is: " + math.circle(r));

break;

case 2:
System.out.println("Enter the Length and width of your rectangle: ");
System.out.println("Enter the length: ");
double len = input.nextDouble();

System.out.println("Enter the width: ");
double wid = input.nextDouble();
System.out.println("The area is: " + math.rectangle(len, wid));
break;

case 3: 
System.out.println("Enter the base and height of your triangle: ");
System.out.println("Enter the base length: ");
double base = input.nextDouble();

System.out.println("Enter the height");
double height = input.nextDouble();

System.out.println("The area is: " + math.triangle(base, height));
break;


default:
return;
        }



    }
}