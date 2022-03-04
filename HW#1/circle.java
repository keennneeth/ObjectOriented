
public class circle
{
private double Radius;


public void GetRadius()
{

    System.out.println(Radius);

}

public void SetRadius(double r)
{
if (r>0 && r<50){
this.Radius = r;
}
}


public double area()
{
return  3.14 * Radius * Radius;
}


public double Circumference()
{
return 2 * 3.14 * Radius;

}
}