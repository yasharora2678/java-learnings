package compilePolymorphism;

public class CreditCardPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment done via Credit Card.");
    }
}
