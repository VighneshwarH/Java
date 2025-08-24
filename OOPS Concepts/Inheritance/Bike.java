public class Bike extends Vehicle {
    boolean hasKickStart;

    public Bike(String brand,
            String model,
            int noOfWheels,
            String fuelType,
            String dateOfPurchase,
            int maxSpeed,
            int seatCapacity,
            String color,
            String brakeType,
            int noOfGears,
            String displayType,
            boolean hasKickStart) {

        super(brand, model, noOfWheels, fuelType, dateOfPurchase,
        maxSpeed, seatCapacity, color, brakeType, noOfGears,
        displayType);
        
        this.hasKickStart = hasKickStart;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Kick Start: " + hasKickStart);
    }

    public void kickStart() {
        if (hasKickStart) {
            System.out.println("Bike is kick started...");
        } else {
            System.out.println("Bike doesn't have kick start.");
        }
    }
}
