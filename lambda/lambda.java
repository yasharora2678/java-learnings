package lambda;

interface MathOperation {
    int operate(int a, int b);
}

public class lambda {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.operate(5, 3));
    }
}