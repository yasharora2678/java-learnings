package functionalInterface;

@FunctionalInterface
interface BasicOperation {
    int perform(int a, int b);
}

// Not a valid functional interface as it contains two abstract methods
// @FunctionalInterface
interface ExtendedOperation extends BasicOperation {
    int multiply(int a, int b);  // Additional abstract method
}

public class LambdaExample {
    public static void main(String[] args) {
        // System.out.println(operation.perform(5, 10));  // Output: 15
    }
}

