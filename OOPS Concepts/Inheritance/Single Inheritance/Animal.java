public class Animal {

    // Properties
    String name;
    int age;
    String species;

    // Methods
    public void speak() {
        System.out.println("Animal speaks");
    }

    protected void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }

    private void breathe() {
        System.out.println("Animal breathes");
    }

    static void staticMethod() {
        System.out.println("Static method in Animal");
    }

    final void finalMethod() {
        System.out.println("Final method in Animal");
    }

    // Additional methods
    public void setDetails(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Species: " + species);
    }
}