public class shop {
    private int code;
    private String name;
    private double price;
   
    // constructor that initializes the code, name, description and price to passed values
    public shop(int code, String name,  double price)
    {
        this.code = code;
        this.name = name;
        this.price = price;
    }
   
    // method to return the product code
    public int getCode()
    {
        return code;
    }
   
    // method to return the product name
    public String getName()
    {
        return name;
    }

   
    // method to return the product price
    public double getPrice()
    {
        return price;
    }
 }

