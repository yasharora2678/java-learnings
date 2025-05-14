package inheritance;

public class Car extends Vehicle {
    int numDoors;

    Car(String brand, int speed, String fuelType, int numDoors) {

        super(brand, fuelType, speed);

        this.numDoors = numDoors;

    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Number of Doors: " + numDoors);

    }
}
