package inheritance;

public class InheritanceClass {
    public static void main(String[] args) {
        Vehicle car = new Car("Maruti Suzuki", 60, "Diesel", 5);

        Vehicle bike = new Bike("Maruti Suzuki", 30, "Petrol", 0);

        System.out.println("🚗 Car Details:");
        car.displayInfo();
        System.out.println("🏍️  Bike Details:");
        bike.displayInfo();
    }
}
