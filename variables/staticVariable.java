package variables;

class Car1 {
    int speed; // ✅ Instance variable (default value is 0)
    static String brand; // Static Variable
    final int topSpeed = 10;

    Car1(String brand) { // Constructor Parameters
        Car1.brand = brand;
    }

    public void displaySpeed(int speed) { // Method Parameters
        System.out.println("Speed: " + speed + "Brand" + Car1.brand + " top speed is " + topSpeed);
    }

}

public class staticVariable {
    public static void main(String[] args) {
        Car1 myCar = new Car1("Maruti Suzuki");
        myCar.displaySpeed(60); // Output: Speed: 0
        System.out.println(Car1.brand);
    }
}
