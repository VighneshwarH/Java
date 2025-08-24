public class Domestic_Animal extends Mammal{
    boolean isPet=true;
    
    public Domestic_Animal(){}


    public Domestic_Animal(String species, String habitat,int numbeOfLegs){
        super(species, habitat, numbeOfLegs);
    }
    
    public Domestic_Animal(String species, String habitat, int numberOfLegs,boolean isPet){
        super(species, habitat,numberOfLegs);
        this.isPet = isPet;
    }

    public Domestic_Animal(String species, String habitat,boolean hasFur, int numberOfLegs,boolean isPet){
        super(species, habitat, hasFur, numberOfLegs);
        this.isPet = isPet;
    }

    void play(){
        System.out.println("Domestic animal is playing.");
    }
}