public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 4, "Petrol", "2020-01-01", 240, 5, "Red", "Disc", 6, "Digital", 4);
        c1.displayInfo();

        c1.openTrunk();
        c1.honk();
        c1.closeTrunk();
        c1.turnOnAC();
        c1.turnOffAC();


        System.out.println("--------------------------------------------------------------------");


        Bike b1 = new Bike("Yamaha", "R15", 2, "Petrol", "2022-12-01", 160, 2, "Blue", "Disc", 6, "Digital", true);
        b1.displayInfo();

        b1.kickStart();
    }
}
