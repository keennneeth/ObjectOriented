

public class OverloadingTest 
{
    public static void main(String[] args)
    {
Overloading C = new Overloading();

    System.out.println (C.max (50, 20, 5));
    System.out.println (C.max ("300", 400));
    System.out.println (C.max ('a', 50));
    System.out.println (C.max ("30", 10));
    System.out.println (C.max ('x', 90));
    System.out.println (C.max (20, 40, 10)); 
    
}
}
