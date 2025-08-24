public class Dog extends Animal { // Dog inherits from Animal
    // Dog's own properties
    String breed;
    boolean isTrained;

    // Dog's own methods
    void bark() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }

    // Method to set Dog-specific details
    public void setDogDetails(String name, int age, String species, String breed, boolean isTrained) {
        super.setDetails(name, age, species); // Call parent method
        this.breed = breed;
        this.isTrained = isTrained;
    }

    // Method to show Dog-specific details
    public void showDogDetails() {
        super.showDetails(); // Call parent method
        System.out.println("Breed: " + breed + ", Trained: " + isTrained);
    }
}