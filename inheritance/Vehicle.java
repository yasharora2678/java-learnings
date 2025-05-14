package inheritance;

public class Vehicle {
    private String brand;
    private String fuelType;
    private Integer speed;

    Vehicle(String brand, String fuelType, Integer speed) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("My vehicle is of " + this.brand + " and it's fueltype is " + this.fuelType
                + " and speed of my vehicle is " + this.speed);
    }
}
