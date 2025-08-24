public class Mammal extends Animal{

    boolean hasFur=true;
    int numbeOfLegs=4;
    public Mammal(){}
    
    public Mammal(String species, String habitat, int numberOfLegs){
        super(species, habitat);
        this.numbeOfLegs = numberOfLegs;
    }

    public Mammal(String species, String habitat,boolean hasFur, int numberOfLegs){
        super(species, habitat);
        this.hasFur = hasFur;
        this.numbeOfLegs = numberOfLegs;
    }
    
    void giveBirth(){
        System.out.println("Mammal gives birth to live young");
    }
}