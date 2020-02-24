package se.lexicon.jakob.inheritance;

public class Puppy extends Dog{
    public Puppy(String name, String breed, int age, int legs, String gender, boolean vaccinated) {
        super(name, breed, age, legs, gender, vaccinated);
    }
    
    @Override
    public String getName() {
        return super.getName() + "Egon";
    }
}

interface test{
}

class TestClass implements T1, T2{
    public void m1() {
    }
}

interface T1{
    int VALUE = 1;
    
    void m1();
}

interface T2{
    int VALUE = 2;
    
    void m1();
}
