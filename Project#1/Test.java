import java.util.Scanner;
import java.util.ArrayList;


public class Test 
{
    static CreateAccount Register = new CreateAccount();
    
    public static void main (String[] args)
    {
        Scanner Info = new Scanner(System.in);


        System.out.print("1.) Log In");
        System.out.print("\n2.) Create an Account");
        System.out.print("\n3.) Exit");
        System.out.print("\nEnter your choice: ");
        String choice = Info.nextLine();
        
        int intChoice = Integer.parseInt(choice);
        



        switch (intChoice)
        {

        case 1:
        System.out.println("Log In: ");
        System.out.println("Enter username: ");
        String loginuser = Info.nextLine();
        System.out.println("Enter Password: ");
        String loginpass = Info.nextLine();

        


        break;
        case 2:

        System.out.print("      SIGN UP      ");
        System.out.print("\n___________________");

        ArrayList<String> account = new ArrayList<String>();

        System.out.print("\nEnter First Name: ");
        String FirstName = Info.nextLine();
        Register.setFirstName(FirstName);

        System.out.print("Enter Last Name: ");
        String LastName = Info.nextLine();
        Register.setLastName(LastName);

        System.out.print("Create a username: ");
        String Username = Info.nextLine();
        Register.setUsername(Username);

        System.out.print("Enter Password: ");
        String Password = Info.nextLine();
        Register.setPassword(Password);

        System.out.print("Enter Address: ");
        String Address = Info.nextLine();
        Register.SetAddress(Address);
        
        System.out.print("Enter Credit Card #");
        String CreditCard = Info.nextLine();
        Register.setCreditCard(CreditCard);

        Customer user = new Customer(FirstName, LastName, Username, Password, Address, CreditCard);

        account.add(FirstName);
        account.add(LastName);
        account.add(Username);
        account.add(Password);
        account.add(Address);
        account.add(CreditCard);
        
        System.out.print(account);

        case 3:
        default:
    
    }
}
}
        
