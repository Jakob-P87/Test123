package se.lexicon.jakob;

import java.util.List;
import java.util.Scanner;

public class ArrayList{
    private static List<Person> people = new java.util.ArrayList<>();
    private static Scanner scan;
    
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        boolean keepRunning = true;
    
        System.out.println("1:Add New Person");
        System.out.println("2:Show All People");
        System.out.println("3:Exit");
        
        try{
            Integer selection = new Integer("2");
            int choice = scan.nextInt();
    
            while(keepRunning) {
                switch(choice) {
                    case 1:
                        addPerson();
                        break;
                    case 2:
                        showAll();
                        break;
                    case 3:
                        keepRunning = false;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        scan.close();
    }
    
    public static void addPerson() {
            System.out.println("Name: ");
            String name = "Jakob";
            System.out.println("Age: ");
            int age = 32;
        
            people.add(new Person(name, age));
    }
    
    public static void showAll() {
        for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName() + "," + people.get(i).getAge());
        }
    }
}

class Person{
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}