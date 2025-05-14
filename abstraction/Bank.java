package abstraction;

abstract class Bank {
    abstract double getInterestRate();
    double getMethod() {
        return 5.6;
    }

    final void show() {
        System.out.println("Hey i am a show method");
    }
}
