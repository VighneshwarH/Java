public class Dog extends Domestic_Animal{
    String breed="Golden Retriever";

    public Dog(){}

    public Dog(String species, String habitat,boolean hasFur, int numberOfLegs,boolean isPet,String breed){
        super(species, habitat, hasFur, numberOfLegs, isPet);
        this.breed = breed;
    }
    void bark(){
        System.out.println("Woof! Woof!");
    }
}