package polymorphism;

class CompileCar {
    void start() { 
        System.out.println("Car is starting..."); 
    }

    void start(String keyType) {  
        System.out.println("Car is starting with a " + keyType);
    }

    void start(int batteryLevel) {  
        System.out.println("Car is starting with battery level: " + batteryLevel + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        CompileCar myCar = new CompileCar();
        myCar.start();  // Output: Car is starting...
        myCar.start("Smart Key");  // Output: Car is starting with a Smart Key
        myCar.start(85);  // Output: Car is starting with battery level: 85%
    }
}

