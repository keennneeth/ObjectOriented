public class BankAccountTest {
    
public static void main(String [] args) 
   {
           BankAccount account;
      for (int i=-100; i<500; i+=200)
      {
         try
         {
            account = new BankAccount(i);
            System.out.println("account created with " + account);
            account.deposit(-100);
            account.deposit(100);
            System.out.println("Balance is:"+account.getBalance());
            account.withdraw(201);
            account.withdraw(-100);
         }
         catch (NegativeStartingBalanceException e)
         {
            System.out.println(e.getMessage());
         } catch (NegativeDepositException e) {
                        // TODO Auto-generated catch block
                 System.out.println(e.getMessage());
                } catch (WithdrawExceedBalanceException e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                
                }
       
      }
      
      
   }
}
