import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// joptionpane

import javax.swing.*;  


public class Registration {
     

public void register() throws FileNotFoundException
        {

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter User Name: ");
    String Uname=sc.nextLine();
    
             
final int MAX=6;
             final int MIN_Uppercase=1;
             final int NUM_Digits=1;
             final int Special=1;

             int uppercaseCounter=0;
             int digitCounter=0;
             int specialCounter=0;
                         
            System.out.print("Enter Password: ");
            String Pass=sc.nextLine();
 
             for (int i=0; i < Pass.length(); i++ ) {
                    char c = Pass.charAt(i);
                    if(Character.isUpperCase(c)) 
                          uppercaseCounter++;
                    else if(Character.isDigit(c)) 
                          digitCounter++;     
                     if(c>=33&&c<=46||c==64){
                      specialCounter++;
                  }
                    
             }
             
             if (Pass.length() >= MAX && uppercaseCounter >= MIN_Uppercase  && digitCounter >= NUM_Digits && specialCounter >= Special)
            { 
                  
            }
             else {
   System.out.println("Your password does not contain the following:");
                    if(Pass.length() < MAX)
                          System.out.println("Needs atleast 6 characters");
                    if (uppercaseCounter < MIN_Uppercase) 
                          System.out.println("Needs atleast 1 Uppercase");
                    if(digitCounter < NUM_Digits) 
                          System.out.println("Needs atleast 1 number");
                    if(specialCounter < Special)
System.out.println("Needs atleast 1 Special Charcter\n----Please Try Again----");
System.exit(0);

             }
             
            System.out.print("Confirm Password: ");
            String ConPass=sc.nextLine();
            Uname=Uname.trim();
            Pass=Pass.trim();
            ConPass=ConPass.trim();

            System.out.print("Enter your full name: ");
            String name = sc.nextLine();

            System.out.print("Enter your address: ");
            String Address = sc.nextLine();

            System.out.print("Enter your credit card number: ");
            String CreditCard = sc.nextLine();


            System.out.println("Choose a security question");
            System.out.println("1. What is your dogs name");
            System.out.println("2. What was your first car");
            System.out.println("3. What city were you born in");
            System.out.println("4. What is your favorite tv show"); 

            String AnswerChoice = sc.nextLine();
            System.out.print("What is your answer? ");
            String Answer = sc.next();
           

            String x= Uname+" "+Pass;
            if(Pass.equals(ConPass))
            {
                 
                  File f = new File("Registration.txt");
                  Scanner content = new Scanner(f);
                   
                   
                  int flag=0;
                  while (content.hasNextLine()) {
                    String data = content.nextLine();
                    if(data.equals(x))
                    {
                        System.out.println("Already Registered");
                        flag=1;
                        System.out.println("1. Registration. ");
                        System.out.println("2. Login. ");
                         
                        System.out.println("Enter your Choice");
                        int choice=sc.nextInt();
                        if(choice==1)
                        {
                            this.register();
                        }
                        else if(choice==2)
                        {
                            this.login();
                        }
                        else
                        {
                            System.out.println("Choose Proper Option");
                        }
                        break;
                    }
                    
                
                  }
                    if(flag==0)
                    {
                        try{
                            BufferedWriter out = new BufferedWriter(new FileWriter("Registration.txt", true)); 
                            out.write("\n" +name + " Account\n");
                            out.write(Uname+" "+Pass+" "+Answer);
                            out.write("\nAddress: "+Address+ "\nCredit Card Number: "+CreditCard);
                            out.write("\n_______________________\n");

                            out.close();
                        }
                        catch (IOException e) {
                            System.out.println("exception occoured" + e);
                        }
                         
                        System.out.println("Account has been created");
                        System.out.println("Your Card Limit Is $500");
                        System.out.println("Please login");
                        this.login();
                    }
                 
                 
            }
            else
            {
                System.out.println("Recheck");
                System.out.println("1. Registration. ");
                System.out.println("2. Login. ");
                 
                System.out.print("Enter your Choice: ");
                int choice=sc.nextInt();
                if(choice==1)
                {
                    this.register();
                }
                else if(choice==2)
                {
                    this.login();
                }
                else
                {
                    System.out.println("Choose Proper Option");
                }
            }
            
        }
    

         
        public static void getInputsFromJOptionPane()
        {
            String name;
            name = JOptionPane.showInputDialog(null,
             "Please enter your name");
            JOptionPane.showMessageDialog(null,"Hi "+ name);
             
        }


         
public void login()
    {
         
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter User Name: ");
        String Uname=sc.nextLine();
         
        System.out.print("Enter Password: ");
        String Pass=sc.nextLine();
        

        System.out.print("Enter security question answer: ");
        String Answer = sc.nextLine();
        Uname=Uname.trim();
        Pass=Pass.trim();
        Answer=Answer.trim();
        String x= Uname+" "+Pass+" "+Answer;



         
         
        try {
             
            File f = new File("Registration.txt");
            Scanner content = new Scanner(f);
            int flag=0;
            while (content.hasNextLine()) {
              String data = content.nextLine();
              if(data.equals(x))
              {
                  
                System.out.println("________________________________");
                  System.out.println("Login Successful (Limit $500)");
                  System.out.println("Welcome to Kenny's Shop.");
                  System.out.println("0.) Log Out");
                  System.out.println("1.) Order History");
                  System.out.println("2.) Enter Shop");

                  System.out.println("________________________________");
                String shopchoice = sc.nextLine();
                int intshopchoice = Integer.parseInt(shopchoice);

                if (intshopchoice ==0)
                {
                    System.out.println("Log out successful");
System.exit(0);

                }

                else if (intshopchoice == 1)
                {
                    try
                    {
                    BufferedReader in = new BufferedReader(new FileReader("Orders.txt"));
                    String line;
                    

                    while((line = in.readLine()) != null)
                    {

                        
                        if(line.startsWith(Uname))
                        System.out.println(line);

                                 

                    }
                
                    in.close();
                    System.exit(0);

                }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                       
                    }
                }
                
                  
else if (intshopchoice ==2)
{
                  
                    ArrayList<shop> products = new ArrayList<shop>();
                    System.out.println("Add Items To Cart\n");
                    products.add(new shop(1,"Vans ",59.99));
                    products.add(new shop(2,"Nikes ",54.99));
                    products.add(new shop(3,"Adidas ",79.99));
                    products.add(new shop(4,"Yeezy's ",299.99));
                    products.add(new shop(5,"New Balance ",89.99));
                    products.add(new shop(6,"Converse ",59.99));
                   
                    ArrayList<shop> order = new ArrayList<>();
                    ArrayList<Integer> quantity = new ArrayList<>();
                   
                    Scanner scan = new Scanner(System.in);
                    int choice, qty;
                    double totalPrice = 0, tax;
                    final double SALES_TAX_RATE = 0.0625;
                   
                    boolean valid = false;
                    do
                    {
                        valid = false;
             
                        for(int i=0;i<products.size();i++)
                        {
                            System.out.println((i+1)+" - "+products.get(i).getName());
                        }
             
                        System.out.println("0 - Proceed to checkout");
                        System.out.print("\nEnter your choice: ");
                        choice = scan.nextInt();
                       
                        if(choice != 0)
                        {
                            for(int i=0;i<products.size();i++)
                            {
                                if(choice == (i+1))
                                {
                                    valid = true;
                                    break;
                                }
                            }
                           
                            if(valid)
                            {
                                System.out.print("Enter quantity: ");
                                qty = scan.nextInt();

                                int delivery;
                            System.out.println("How would you like to pick up your order?");
                            System.out.println("1.) Store Pick up - $0.00");
                            System.out.println("2.) Deliver - $3.00 Per item");
                            delivery = scan.nextInt();

                            if (delivery == 1)
                            {

                                System.out.println("Free Store Pick up\n");
                                qty = qty*1;
                            }

                            else if (delivery == 2)
                            {

                                System.out.println("$3.00 per item");
                                totalPrice = totalPrice+3;
                            }
                            else
                            {

                                System.out.println("Invalid Option");
                                System.exit(0);
                            }

                               
                                if(qty > 0)
                                {
                                    order.add(products.get(choice-1));
                                    quantity.add(qty);

                                }else
                                    System.out.println("Invalid quantity to purchase. Please enter quantity > 0");
                            }else
                                System.out.println("Invalid product.");
                        }
                        System.out.println();
                    }while(choice != 0 );
                   
                  
                    if(order.size() > 0)
                    {
                        System.out.println("\nRECEIPT");
                        System.out.println("--------------");
                        System.out.printf("%-10s%-30s%-30s%10s\n","Name","Price","Quantity","Total Price");
                        for(int i=0;i<order.size();i++)
                        {
                            System.out.printf("%-10s%-30s%-30s%-10s\n",order.get(i).getName(),order.get(i).getPrice(),quantity.get(i),order.get(i).getPrice()*quantity.get(i));
                            
                            totalPrice += (order.get(i).getPrice()*quantity.get(i));
                            tax = totalPrice*SALES_TAX_RATE;

                            if (totalPrice+tax > 500)
                            {   
                                System.out.println("You've exceeded your credit limit");
                                System.out.println("Only saved what you could afford, Your limit was $500");
                                System.out.println("Your total was: $"+ totalPrice);
                                System.exit(0);
                            }
        
                else if (totalPrice+tax <500)
                {
        

                               File userorder = new File("Orders.txt");

                        try{

                            
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy/ HH:mm:ss");
                        Date today = Calendar.getInstance().getTime();        
                        String date= dateFormat .format(today);
                        
                            BufferedWriter out = new BufferedWriter(new FileWriter("Orders.txt", true)); 

                            

                            tax = totalPrice*SALES_TAX_RATE;

                            out.write("\n"+Uname + "'s Order" + " -Ordered On -" +today+"-  | ");

                            out.write(String.format(order.get(i).getName()));

                           out.write(String.valueOf(" "+order.get(i).getPrice()+" Each"));
                        out.write(String.valueOf("|Quantity-"+quantity.get(i)));
                        out.write(String.valueOf("|Total Price-"+order.get(i).getPrice()*quantity.get(i)+"$|"));


                        
                   
                            out.close();
                        }
                        catch (IOException e) {
                            System.out.println("exception occoured" + e);
                        }

                    }
                
            
                        }
                        tax = totalPrice*SALES_TAX_RATE;
                        System.out.printf("\nTotal price(before tax): $%.2f",totalPrice);
                        System.out.printf("\nSales Tax: $%.2f",tax);
                        System.out.printf("\nTotal price(after tax): $%.2f\n",totalPrice+tax);

                        
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy/ HH:mm:ss");
                        Date today = Calendar.getInstance().getTime();        
                        String date= dateFormat .format(today);
                        System.out.println(today);

                     
                  flag=1;
                  break;

                  
              }
              
              
            }

            else 

            {
                System.out.println("Invalid Choice, Log in again");
        System.exit(0);
                
            }
              
            
        }
   
    }
   
              if(flag==0)
              {
                  System.out.println("Login Failed");
                  System.out.println("1. Registration. ");
                  System.out.println("2. Login. ");
                   
                  System.out.println("Enter your Choice");
                  int choice=sc.nextInt();
                  if(choice==1)
                  {
                      this.register();
                  }
                  else if(choice==2)
                  {
                      this.login();
                  }
                  else
                  {
                      System.out.println("Choose Proper Option");
                  }
              }
             
            content.close();
          } 
          catch (FileNotFoundException e) {
           
               
            System.out.println("Error.");
            e.printStackTrace();
          }
       
      sc.close();
  }
}
           
                           
              
  
        
             
                    
                    
              
              