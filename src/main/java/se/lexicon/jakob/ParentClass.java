package se.lexicon.jakob;

public class ParentClass{
    String name;
    int id;
    
    public ParentClass(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public static String personInfo()
    {
        return "";
    }
}
