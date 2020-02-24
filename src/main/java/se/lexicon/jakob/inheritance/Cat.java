package se.lexicon.jakob.inheritance;

public class Cat extends Animal{
    private boolean kitten;
    public Cat(String name, String breed, int age, int legs, String gender, boolean vaccinated) {
        super(name, breed, age, legs, gender, vaccinated);
    }
    
    public boolean isKitten()
    {
        if(getAge() <= 1){
            kitten = true;
        }
        return kitten;
    }
}
