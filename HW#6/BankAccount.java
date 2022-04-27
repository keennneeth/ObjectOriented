public class BankAccount {
    /**
   The BankAccount class simulates a bank account.
*/
   private double balance;      // Account balance

   /**
      This constructor sets the starting balance
      at 0.0.
   */

   public BankAccount()
   {
      balance = 0.0;
   }
   
   /**
      This constructor sets the starting balance
      to the value passed as an argument.
      @param startBalance The starting balance.
      @exception NegativeStartingBalanceException When
      startBalance is negative.
   */

   public BankAccount(double startBalance)
                   throws NegativeStartingBalanceException
   {
      if (startBalance < 0)
         throw new NegativeStartingBalanceException(startBalance);
         
      balance = startBalance;
   }

   /**
      This constructor sets the starting balance
      to the value in the String argument.
      @param str The starting balance, as a String.
   */

   public BankAccount(String str)
   {
      balance = Double.parseDouble(str);
   }

   /**
      The deposit method makes a deposit into
      the account.
      @param amount The amount to add to the
      balance field.
   */


  public void deposit(double amount)throws NegativeDepositException
  { if(amount<0) {
     throw new NegativeDepositException(amount);}
  balance += amount;
  }
   /**
      The withdraw method withdraws an amount
      from the account.
      @param amount The amount to subtract from
      the balance field.
   */

  public void withdraw(double amount)throws WithdrawExceedBalanceException,WithdrawExceedBalanceException
  { if(amount<0) {
     throw new WithdrawExceedBalanceException(amount);}
     if((balance-amount)<0) {
     throw new WithdrawExceedBalanceException(amount);}
  balance -= amount;
  }
  public String toString()
  {
  return "balance = $" + balance;
  }

   /**
      The setBalance method sets the account balance.
      @param b The value to store in the balance field.
   */

   public void setBalance(double b)
   {
      balance = b;
   }

   /**
      The setBalance method sets the account balance.
      @param str The value, as a String, to store in
      the balance field.
   */

   public void setBalance(String str)
   {
      balance = Double.parseDouble(str);
   }
   
   /**
      The getBalance method returns the
      account balance.
      @return The value in the balance field.
   */

   public double getBalance()
   {
      return balance;
   }

}

