# 🚗🛵 Understanding Inheritance in Java (Vehicle Example)

## 📌 Introduction
**Inheritance** is one of the four fundamental OOP (Object-Oriented Programming) principles in Java.  
It allows a class (child/subclass) to **inherit properties and behaviors** (fields and methods) from another class (parent/superclass).  

This example demonstrates **Inheritance in Java** using a `Vehicle` superclass and two subclasses: `Car` and `Bike`.

---

## 📂 Project Structure
```
├── Vehicle.java   # Base class (Superclass)
├── Car.java       # Derived class (Subclass of Vehicle)
├── Bike.java      # Derived class (Subclass of Vehicle)
└── Main.java      # Driver program
```

---

## 🚙 Vehicle.java (Base Class)

```java
public class Vehicle {
    String brand, model, fuelType, dateOfPurchase, color, brakeType, displayType;
    int noOfWheels, maxSpeed, seatCapacity, noOfGears;

    // Constructor
    public Vehicle(String brand, String model, int noOfWheels, String fuelType, String dateOfPurchase, 
                   int maxSpeed, int seatCapacity, String color, String brakeType, 
                   int noOfGears, String displayType) {
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

    // Common methods for all vehicles
    public void startEngine() { ... }
    public void fillFuel(String fuel) { ... }
    public void accelerate(int speed) { ... }
    public void applyBrake() { ... }
    public void stopEngine() { ... }
    public void displayInfo() { ... }
}
```

### 🔑 Key Methods:
- **startEngine()** → Starts the vehicle’s engine.  
- **fillFuel(String fuel)** → Fills fuel into the vehicle.  
- **accelerate(int speed)** → Increases speed.  
- **applyBrake()** → Applies brakes.  
- **stopEngine()** → Stops the engine.  
- **displayInfo()** → Displays detailed info about the vehicle.  

---

## 🚗 Car.java (Subclass of Vehicle)

```java
public class Car extends Vehicle {
    int noOfDoors;

    public Car(..., int noOfDoors) {
        super(...); // Calls Vehicle constructor
        this.noOfDoors = noOfDoors;
    }

    // Overridden method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + noOfDoors);
    }

    // Car-specific methods
    public void openTrunk() { ... }
    public void honk() { ... }
    public void closeTrunk() { ... }
    public void turnOnAC() { ... }
    public void turnOffAC() { ... }
}
```

### 🚘 Car-specific Methods:
- **displayInfo()** → Overrides parent method and also prints `noOfDoors`.  
- **openTrunk() / closeTrunk()** → Opens/closes the car’s trunk.  
- **honk()** → Honks the horn.  
- **turnOnAC() / turnOffAC()** → Controls car’s AC.  

---

## 🏍️ Bike.java (Subclass of Vehicle)

```java
public class Bike extends Vehicle {
    boolean hasKickStart;

    public Bike(..., boolean hasKickStart) {
        super(...); // Calls Vehicle constructor
        this.hasKickStart = hasKickStart;
    }

    // Overridden method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Kick Start: " + hasKickStart);
    }

    // Bike-specific method
    public void kickStart() {
        if (hasKickStart) {
            System.out.println("Bike is kick started...");
        } else {
            System.out.println("Bike doesn't have kick start.");
        }
    }
}
```

### 🏍️ Bike-specific Methods:
- **displayInfo()** → Extends parent info by printing `hasKickStart`.  
- **kickStart()** → Checks if bike can be kick-started.  

---

## 🖥️ Main.java (Driver Program)

```java
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 4, "Petrol", "2020-01-01", 
                          240, 5, "Red", "Disc", 6, "Digital", 4);
        c1.displayInfo();
        c1.openTrunk();
        c1.honk();
        c1.closeTrunk();
        c1.turnOnAC();
        c1.turnOffAC();

        System.out.println("------------------------------------------------");

        Bike b1 = new Bike("Yamaha", "R15", 2, "Petrol", "2022-12-01", 
                            160, 2, "Blue", "Disc", 6, "Digital", true);
        b1.displayInfo();
        b1.kickStart();
    }
}
```

---

## 🏆 Concept Demonstrated
1. **Inheritance** → `Car` and `Bike` extend `Vehicle`.  
2. **Constructor Chaining** → `super(...)` calls parent constructor.  
3. **Method Overriding** → `displayInfo()` customized in child classes.  
4. **Polymorphism** → Same method (`displayInfo()`) behaves differently.  
5. **Code Reusability** → Common methods (`startEngine()`, `applyBrake()`) defined once in `Vehicle` and reused.  

---

## ✅ Output Example
```
Brand: Toyota
Model: Camry
Number of Wheels: 4
Fuel Type: Petrol
Date of Purchase: 2020-01-01
Max Speed: 240
Seat Capacity: 5
Color: Red
Brake Type: Disc
Number of Gears: 6
Display Type: Digital
Number of Doors: 4
Trunk is opened...
Honking...
Trunk is closed...
AC is turned on...
AC is turned off...
------------------------------------------------
Brand: Yamaha
Model: R15
Number of Wheels: 2
Fuel Type: Petrol
Date of Purchase: 2022-12-01
Max Speed: 160
Seat Capacity: 2
Color: Blue
Brake Type: Disc
Number of Gears: 6
Display Type: Digital
Has Kick Start: true
Bike is kick started...
```

---

## 📖 Conclusion
This project beautifully demonstrates **Inheritance in Java**:  
- A **common parent class** (`Vehicle`) defines shared attributes & methods.  
- **Child classes** (`Car`, `Bike`) extend the parent, reuse its code, and add their **own specific features**.  
- This ensures **clean, reusable, and maintainable** object-oriented code.  
