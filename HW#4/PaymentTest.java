class PaymentTest extends Payment

{
    public static void main(String[] args)
    {
        CashPayment cash1 = new CashPayment(20), cash2 = new CashPayment(50);
        CreditCardPayment credit1 = new CreditCardPayment(45, "Kenny", "03/23/2025","8475929201758435");
        CreditCardPayment credit2 = new CreditCardPayment(100, "Rick", "09/03/2024", "2658493907562386");


        System.out.println("Account 1 Cash Payment:"); 
        cash1.paymentDetails( );
        System.out.println( );
        System.out.println("Account 2 Cash Payment:");
        cash2.paymentDetails( );
        System.out.println( );
        System.out.println("Account 1 Credit Payment:");
        credit1.paymentDetails( );
        System.out.println( );
        System.out.println("Account 2 Credit Payment:");
        credit2.paymentDetails( );
        System.out.println( );


    }
    
}
