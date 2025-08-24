public class Vehicle {
    String brand;
    String model;
    int noOfWheels;
    String fuelType;
    String dateOfPurchase;
    int maxSpeed;
    int seatCapacity;
    String color;
    String brakeType;
    int noOfGears;
    String displayType;

    public Vehicle(String brand, String model, int noOfWheels, String fuelType, String dateOfPurchase, int maxSpeed,
            int seatCapacity, String color, String brakeType, int noOfGears, String displayType) {
        this.brand = brand;
        this.model = model;
        this.noOfWheels = noOfWheels;
        this.fuelType = fuelType;
        this.dateOfPurchase = dateOfPurchase;
        this.maxSpeed = maxSpeed;
        this.seatCapacity = seatCapacity;
        this.color = color;
        this.brakeType = brakeType;
        this.noOfGears = noOfGears;
        this.displayType = displayType;
    }

    public void startEngine(){
        System.out.println(brand + " " + model + " engine is started...");
    }

    public void fillFuel(String fuel){
        System.out.println(fuel+" is filling..");
        System.out.println(fuel+" filled.");
    }

    public void accelerate(int speed){
        System.out.println("Accelerating by "+ speed +"km/h");
    }

    public void applyBrake(){
        System.out.println("Braking..");
    }

    public void stopEngine(){
        System.out.println(brand + " " + model + " engine is stopped...");
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of Wheels: " + noOfWheels);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Date of Purchase: " + dateOfPurchase);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Color: " + color);
        System.out.println("Brake Type: " + brakeType);
        System.out.println("Number of Gears: " + noOfGears);
        System.out.println("Display Type: " + displayType);
    }


}
