package se.lexicon.jakob.inheritance;

public class MainAnimal{
    public static void main(String[] args) {
        Animal dog = new Puppy("Bingo", "Labrador", 2, 4, "Male", true);
        Animal cat = new Cat("Egon", "Bondkatt", 4,4, "Female", true);
    
        System.out.println(dog.getName());
    }
}
