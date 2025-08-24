public class Animal{
    String species;
    String habitat;

    public Animal(){}
    public Animal(String species, String habitat){
        this.species = species;
        this.habitat = habitat;
    }

    void eat(){
        System.out.println("Animal is eating....");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}