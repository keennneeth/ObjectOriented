    import java.util.Scanner;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.IOException;
     

public class account {
    public static void main(String[] args) throws FileNotFoundException{
     
        try {
             
              File obj = new File("Registration.txt");
               
              if (obj.createNewFile()) 
              {
                System.out.println("File is created");
              } 
               
            } 
            catch (IOException e) 
            {
              System.out.println("An error occurred.");
              e.printStackTrace();
               
            }
         
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.print("__________________________\n");
        System.out.print("1.) Log In");
        System.out.print("\n2.) Create an Account");
        System.out.print("\n3.) Exit");
        System.out.print("\n__________________________");
        System.out.print("\nEnter your choice: ");
        choice=sc.nextInt();

       
        if(choice==1)
        {
            Registration user = new Registration();
            user.login();
        }
          
       else if(choice==2)
        {
            Registration user = new Registration();
            user.register();
        }
        else if(choice ==3)
        {
        System.out.println("Exiting...");
        

        }
        else
        {
            System.out.println("Not an option");
        }
       
    }
     
}


