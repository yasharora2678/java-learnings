package compilePolymorphism;

public class UPIPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment done via UPI.");
    }
}