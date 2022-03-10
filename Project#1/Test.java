import java.util.Scanner;

public class Test 
{
    static CreateAccount Register = new CreateAccount();
    
    public static void main (String[] args)
    {
        Scanner login = new Scanner(System.in);


        System.out.print("1.) Log In");
        System.out.print("2.) Create an Account");
        System.out.print("3.) Exit");
        String choice = login.nextLine();
        
        
        int intChoice = Integer.parseInt(choice);
        
        switch (intChoice)
        {

        case 1:
        System.out.println("Log In: ");
        
        case 2:
        Scanner Info = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String FirstName = Info.nextLine();
        Register.setFirstName(FirstName);

        System.out.print("Enter Last Name: ");
        String LastName = Info.nextLine();
        Register.setLastName(LastName);

        System.out.print("Enter Address: ");
        String Address = Info.nextLine();
        Register.SetAddress(Address);
        
        System.out.print("Enter Credit Card #");
        String CreditCard = Info.nextLine();
        Register.setCreditCard(CreditCard);

        System.out.println(Register.toString());

        case 3:
        default:
    }
        
