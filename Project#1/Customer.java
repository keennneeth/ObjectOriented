public class Customer {
    
    private String FirstName;
    private String LastName;
    private String Username;
    private String Password;
    private String Address;
    private String CreditCard;

    public Customer(String FirstName, String LastName, String Username, String Password, String Address, String CreditCard) {
            FirstName = this.FirstName;
            LastName = this.LastName;
            Username = this.Username;
            Password = this.Password;
            Address = this.Address;
            CreditCard = this.CreditCard;
           
    }

    public String getUsername() {
            return this.Username;
    }
}


