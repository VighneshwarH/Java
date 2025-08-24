## Interfaces
- Declared using the `interface` keyword.
- Defines a contract of methods that implementing classes must follow.
- All methods in interfaces are **implicitly abstract and public** (before Java 8).
- From Java 8 onwards, interfaces can have **default** and **static methods**.
- A class can implement multiple interfaces, supporting **multiple inheritance**.

### Example:
```java
// Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Smart Light implementing SmartDevice
class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light is OFF");
    }
}

// Smart Fan implementing SmartDevice
class SmartFan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan is OFF");
    }
}

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        light.turnOn();
        light.turnOff();

        System.out.println();

        SmartDevice fan = new SmartFan();
        fan.turnOn();
        fan.turnOff();
    }
}

```