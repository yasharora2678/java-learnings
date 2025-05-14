package abstractionUsingInterface;

public class SBI implements Bank {
    @Override
    public double getInterestRate(){
        return 5.5;
    }
}
