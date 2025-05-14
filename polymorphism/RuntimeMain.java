package polymorphism;

class Car {
    void start() {  
        System.out.println("Generic Car is starting...");  
    }
}

class Tesla extends Car {
    @Override
    void start() {  
        System.out.println("Tesla is starting silently with an electric motor.");
    }
}

class BMW extends Car {
    @Override
    void start() {  
        System.out.println("BMW is starting with a powerful engine roar!");
    }
}

public class RuntimeMain {
    public static void main(String[] args) {
        Car myCar1 = new Tesla();  // Tesla object, referenced as Car
        myCar1.start();  // Output: Tesla is starting silently with an electric motor.

        Car myCar2 = new BMW();  // BMW object, referenced as Car
        myCar2.start();  // Output: BMW is starting with a powerful engine roar!
    }
}

