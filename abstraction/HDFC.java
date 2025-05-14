package abstraction;

public class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }

    @Override
    double getMethod() {
        return 5.9;
    }
}
