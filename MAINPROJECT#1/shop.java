public class shop {
    private int code;
    private String name;
    private double price;
   
    public shop(int code, String name,  double price)
    {
        this.code = code;
        this.name = name;
        this.price = price;
    }
   
    public int getCode()
    {
        return code;
    }
   
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
 }

