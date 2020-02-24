package se.lexicon.jakob.inheritance;

public class Dog extends Animal{
    private boolean puppy;
    
    public Dog(String name, String breed, int age, int legs, String gender, boolean vaccinated) {
        super(name, breed, age, legs, gender, vaccinated);
    }
    
    public boolean isPuppy()
    {
        if (getAge() <= 1)
        {
            this.puppy = true;
        }
        return puppy;
    }
    
    public static void m1()
    {
    
    }
    
    public void sm1()
    {
    
    }
}
