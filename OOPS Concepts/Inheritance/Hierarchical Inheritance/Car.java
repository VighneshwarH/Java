public class Car extends Vehicle {
    int noOfDoors;

    public Car(String brand,
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
            int noOfDoors) {
        super(brand, model, noOfWheels, fuelType, dateOfPurchase, maxSpeed, seatCapacity, color, brakeType, noOfGears,
                displayType);
        this.noOfDoors = noOfDoors;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + noOfDoors);
    }

    public void openTrunk(){
        System.out.println("Trunk is opened...");
    }

    public void honk(){
        System.out.println("Honking...");
    }

    public void closeTrunk(){
        System.out.println("Trunk is closed...");
    }
    public void turnOnAC(){
        System.out.println("AC is turned on...");
    }
    public void turnOffAC(){
        System.out.println("AC is turned off...");
    }
}
