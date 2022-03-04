import java.util.Scanner;


public class TestCircle 

{
    public static void main (String[] args){

    Scanner info = new Scanner(System.in);
    circle c = new circle();
System.out.print("Enter the radius of your circle (No more than 50): ");

double t=0.0;
if(info.hasNextDouble()){
t=info.nextDouble();
if(t>0 && t<50){
c.SetRadius(t);

System.out.format("The Area of your circle is: " + c.area());
System.out.format("\nThe Circumference of your circle is: "+ c.Circumference());

}
}
}
}
