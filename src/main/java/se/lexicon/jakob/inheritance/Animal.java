package se.lexicon.jakob.inheritance;

public abstract class Animal{
    private String name;
    private String breed;
    private int age;
    private int legs;
    private String gender;
    private boolean vaccinated;
    
    public Animal(String name, String breed, int age, int legs, String gender, boolean vaccinated) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.legs = legs;
        this.gender = gender;
        this.vaccinated = vaccinated;
    }
    
    public static void m1()
    {
    
    }
    
    public String getName() {
        return name;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getLegs() {
        return legs;
    }
    
    public String getGender() {
        return gender;
    }
    
    public boolean isVaccinated() {
        return vaccinated;
    }
}
