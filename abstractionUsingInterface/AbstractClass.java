package abstractionUsingInterface;

public class AbstractClass {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        Bank bank2 = new HDFC();

        System.out.println("SBI Interest Rate" + bank1.getInterestRate());
        System.out.println("HDFC Interest Rate" + bank2.getInterestRate());
    }
}