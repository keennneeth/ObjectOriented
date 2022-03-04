public class Overloading

{
  public int max (int a, int b, int c)
  {

if (a>b && a>c)
{
    return a;
}   
else if (b>a && b>c)
{
    return b;
}
else 
{
    return c;
}


  }

  public int max (char a1, int b1)
  {

    if (a1>b1)
    {
        return a1;
    }   
    else 
    {
        return b1;
    }

  }

  public int max (String str, int a2)
  {
int h = Integer.parseInt(str);

    if (h > a2)
    { 
        return h;
    }   
    else 
    {
        return a2;
    }
  }
}