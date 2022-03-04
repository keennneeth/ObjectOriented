import java.lang.Math;


class Geometry

{
    
public static double circle(double r)
{
    return Math.PI*r*r;
}

public static double rectangle(double len, double wid)
{
    return len*wid;
}

public static double triangle (double base, double height)
{
    return base*height/2;
}
}
