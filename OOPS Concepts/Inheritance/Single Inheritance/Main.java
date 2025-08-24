public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Set details
        d.setDogDetails("Buddy", 5, "Canine", "Golden Retriever", true);

        // Call inherited methods
        d.speak();         // Animal's method
        d.eat();           // Animal's method
        d.sleep();         // Animal's method
        d.showDetails();   // Animal's method
        d.finalMethod();   // Animal's method

        // Call Dog's own methods
        d.bark();
        d.fetch();
        d.showDogDetails();
    }
}