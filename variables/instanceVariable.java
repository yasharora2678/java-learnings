package variables;

class Car {
    int speed;  // ✅ Instance variable (default value is 0)

    public void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
}
public class instanceVariable {
    public static void main(String[] args) {
        Car myCar = new Car(); 
        myCar.displaySpeed();  // Output: Speed: 0
    }
}
