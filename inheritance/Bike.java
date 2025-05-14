package inheritance;

public class Bike extends Vehicle {
    int numDoors;

    Bike(String brand, int speed, String fuelType, int numDoors) {

        super(brand, fuelType, speed);

        this.numDoors = numDoors;

    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Number of Doors: " + numDoors);

    }
}
