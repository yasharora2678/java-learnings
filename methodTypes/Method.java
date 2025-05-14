package methodTypes;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) { //Method Overloading
        return a + b;
    }

    final void show() {
        System.out.println("Final method");
    }
}

class MethodTypes extends MathOperations {
    public static void greet() { // User Defined Method  & Static Method
        System.out.println("Hello, Welcome to Java!");
    }

    public static void calculate() { // System Defined Method
        int max = Math.max(10, 20);
        System.out.println("Max: " + max); // Output: 20
    }

    @Override // Method Overloading
    double add(double a, double b) {
        return a * b;
    }

}

public class Method {

    public static void main(String[] args) {

        MethodTypes obj = new MethodTypes();
        MethodTypes.greet();
        System.out.println(obj.add(4, 5));
    }
}
