package se.lexicon.jakob;

public class TestEnthuware{
    public static void main(String[] args) {
        Operation subtract = (num1, num2) -> num1 - num2;
        Operation add = (Integer::sum);
        Operation multiply = (num1, num2) -> num1 * num2;
        
        Names concatNames = (s1, s2) -> s1 + " " + s2;
        Names compareNames = (s1,s2) -> {
            if(s1.equals(s2)) {
                System.out.println("Same name");
            }else{
                System.out.println("Not the same name");
            }
            return "";
        };
        
        calculate(multiply);
        getNames(concatNames);
    }
    
    public static void calculate(Operation operate)
    {
        System.out.println(operate.numbers(5, 6));
    }
    
    public static void getNames(Names names){
        System.out.println(names.names("Lasse", "Berghagen"));
    }
}

class Employee{
    private String fName;
    private String lName;
    
    public Employee(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    
    public String getfName() {
        return fName;
    }
    
    public String getlName() {
        return lName;
    }
}

interface Names{
    String names(String s1, String s2);
}

interface Operation{
    int numbers(int a,int b);
}

