package compilePolymorphism;

public class Main {
    public static void main(String[] args) {
        Payment myPayment = new UPIPayment();  
        myPayment.makePayment();  // Output: Payment done via UPI.

        myPayment = new CreditCardPayment();  
        myPayment.makePayment();  // Output: Payment done via Credit Card.

        myPayment = new UPIPayment();  
        myPayment.makePayment();  // Output: Payment done via Wallet Balance.
    }
}