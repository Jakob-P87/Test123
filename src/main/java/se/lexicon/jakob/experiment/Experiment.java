package se.lexicon.jakob.experiment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import se.lexicon.jakob.test.*;

public class Experiment{
    MainC c = new MainC("Kalle", LocalDate.of(1987,8,17));
    
    /**==========================================================================================================================================================*/
    /** //Apply access modifiers. */
    private int privateField; //Only accessible in the Class. Fields are also called Member variables. This includes methods in a class.
    int defaultField; //Only accessible in the package, not even to sub-classes outside package.
    protected int protectedField; //Only accessible to package and sub-classes outside package.
    public int publicField; //Accessible through the entire application.
    
    
    /**==========================================================================================================================================================*/
    /** //Apply encapsulation principles to a class.*/
//    Encapsulation is used to protect data and variables.
//    Access to change data can and should be given to users through methods.
    
    
    /**==========================================================================================================================================================*/
    /** Compare and contrast the features and components of Java such as: Platform independence, object orientation, encapsulation, etc.*/
//    Java is platform independent, you only need Java Runtime Environment on the platform you choose to be able to run applications and software.
//    You will need to compile the software with a Java Compiler.
    
    
    /**==========================================================================================================================================================*/
    /** Compare loop constructs.*/
    
    public static class LoopConstructs{
        //    There is three
//    For loop is a more controlled way to loop through a list of objects.
        String forLoop() {
            for(int i = 0; i < 5; i++) {
                return "Simple loop to print 5 times";
            }
            return "Loop not working";
        }
    
        //    ForEach Loop is good for iterating through a list of objects.
        int forEachLoop() {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
            for(int temp : arr) {
                return temp;
            }
            return arr[1];
        }
    
        //    While can be use to keep running a block of code for as long as the condition is met.
        String whileLoop() {
            boolean keepRunning = true;
        
            while(keepRunning) {
                System.out.println("Will print until condition is false");
                keepRunning = false;
            }
            return null;
        }
    
        //    Do-while is a way to make the while loop iterate once before checking if the condition is true.
//    The while part of the loop does not have a code-block, everything is handled inside the do part of the loop.
        int doWhileLoop() {
            int count = 0;
        
            do {
                System.out.println("Do will make the loop run at least once");
                System.out.println("The loop will keep running if the condition in while is true");
                System.out.println("The while part cannot have a body");
                System.out.println("All the stuff is happening inside the Do part of the Do-while loop");
                count++;
            } while(count < 5);
            return count;
        }
    }
    
    
    /**==========================================================================================================================================================*/
    /** Create a try-catch block and determine how exceptions alter normal program flow.*/
//    Try-catch is used to catch an exception at runtime, apart from the normal flow of the code.
    
    
    /**==========================================================================================================================================================*/
    /** //Create and manipulate Strings.*/
    public static void stringManipulation() {
        String str1 = "Java";
        String str2 = "java";
    
        System.out.println(str1 == str2); //Compare two different objects, since they are different this will always show false.
        System.out.println(str1.equals(str2)); //Compare the contents of the two objects, since the first one has uppercase and the second one has lowercase, this will show false.
        System.out.println(str1.equalsIgnoreCase(str2)); //Compare the content ignoring Uppercase and Lowercase, so this will always be true.
        System.out.println(str1.contains("ava")); //Compare the string with a specific character sequence, if the char sequence exist in the string it will show true.
        System.out.println(str1.indexOf('v',2)); //Check the index position of a character in the string.
        System.out.println(str1.charAt(2)); //Get the character at the specific index in the string, the first character is always at index 0.
    
        String str3 = str2; //Take the object from str2 and store it in a new variable.
        System.out.println(str3 == str2); //str3 reference contains the object in str2, so this will print true.
        str2 = null; //Remove object from reference, if there is no other reference for the object in str2, then the object will be garbage collected.
        System.out.println(str2); //Just to check if the reference is empty.
        str2 = "ava"; //Add new object to reference,
        System.out.println(str2);
    }
    
    
    /**==========================================================================================================================================================*/
    /** Create and manipulate calendar data using the following classes: java.time.LocalDateTime, java.time.LocalDate, java.time.LocalTime, java.time.format.DateTimeFormatter, java.time.Period.*/
    static void dateTime(){
        LocalDateTime ldt = LocalDateTime.of(2020,2,7,1,1); //Set the date and time, this class is immutable
        //You can't write new before LocalDateTime.
        ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME); //Set the format of date and time to the local datetime format.
        LocalTime lt = LocalTime.now(); //Get the local time on current platform.
        LocalDate ld = LocalDate.parse("2020-02-07"); //This will convert a string to a datetime object.
        
        ldt.plusMonths(1); //This will not affect the previous created datetime object.
        ldt = ldt.plusDays(1); //You have to give the new value to the old reference to change the object this way.
    
        System.out.println(ld);
    }
    
    
    /**==========================================================================================================================================================*/
    /** Create and overload constructors; differentiate between default and user defined constructors.*/
//    A Default constructor is given to the object when it is created.
//    A user defined constructor is created in the class by the programmer, the programmer can choose to use a no-args constructor, or implement the arguments needed to create an object.
    
    
    /**==========================================================================================================================================================*/
    /** Create methods with arguments and return values; including overloaded methods.*/
//    An overloading method need to get different parameter types or take more of the same parameter type.
//    The parameters can never be equal to or same as the overloaded method.
    public static class OverLoads{
        int overload(int a, int b) {
            return a + b;
        }
    
        int overload(int num1, int num2, int num3) {
            return (num1 + num2) * num3; //The parentheses will make the addition happen before the multiplication.
        }
    
        String overload(String fName, String lName) {
            return fName + " " + lName;
        }
    }
    
    
    /**==========================================================================================================================================================*/
    /** Declare and initialize variables (including casting primitive data types).*/
    public static void primitiveCasting(){
        byte b = 127;
        short s = 1;
        int i = 128;
        long l = Integer.MAX_VALUE + 1;
        System.out.println(l);
    
        i = (int) l; //Casting long to int
        l = s;
        l = i;
    
        double e = 1.0;
        float f = 1.0F;
    
        //c = (int) f;
        e = i;
        l = (long) e; //Casting double to long, this will remove the decimal value from double.
        f = l;
        e = f;
        f = (float) e; //Casting double to float
    
        System.out.println(l);
    }
    
    
    /**==========================================================================================================================================================*/
    /** //Declare and use ArrayList of a given type.*/
    public static void arrayList(){
        ArrayList<String> al = new ArrayList(); //Creating a new ArrayList containing Strings, and only Strings.
        List list = new ArrayList();
    
        al.ensureCapacity(3);
        
        al.add("Java"); //Adding new String to the ArrayList
        al.add("a");
        al.add(2,"b");
        al.add("c");
        al.remove("c"); //Removing the specified object in the array, will only remove one object, not two if there is more
        System.out.println(al);
    }
    
    
    /**==========================================================================================================================================================*/
    /** Declare, instantiate, initialize and use a one-dimensional array.*/
    static void array(){
        int[] arr = new int[2]; //Array with two index positions
        int i1 = 2;
        
        arr[0] = 1; //Set index 0 to 1
        arr[1] = 2; // Set index 1 to 2
        arr[i1] = 3;
    
        for(int i = 0; i < arr.length; i++) { //Check if int i is less then the length of the array,
            System.out.println(arr[i]); //Will print the element on index positions
        }
        
        for(int temp : arr)
        {
            System.out.println(temp);
        }
    }
    
    
    /**==========================================================================================================================================================*/
    /** Declare, instantiate, initialize and use multi-dimensional arrays.*/
    static void multiArray(){
        int[][] arr1 = new int[2][2]; //This contains two one dimensional arrays with two elements in each array.
        int[] arr2[] = { //A multidimensional array with the values declared
                            {
                                35,
                                40
                            },
                            {
                                55,
                                60
                            }
                        };
        
        arr1[0][0] = 1; //This will add a new int at the first index of the first array.
        arr1[0][1] = 3;
        arr1[1][0] = 2; //This will add a new int at the first index of the second array.
        arr1[1][1] = 4;
    
//        Use a double for loop to iterate through all the dimensions of the array
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]); //This will print the elements of the first dimension, and then print the elements in the second dimension.
            }
        }
        
//        Use the For-Each loop if you want to see all the objects in the array
        for(int[] temp : arr2)
        {
            for(int temp1 : temp)
            System.out.println(temp1);
        }
    }
    
    
    /**==========================================================================================================================================================*/
    /** Define the scope of variables.*/
//    Instance variables does not need to declared when they are initialized, they will get a default value.
//    Local variables are only available in the scope where they are declared, and they need to be initialized before usage.
    
    
    /**==========================================================================================================================================================*/
    /** Define the structure of a Java class.*/
//    Methods and fields are all members in a class.
    
    
    /**==========================================================================================================================================================*/
    /** Describe the advantages of Exception handling.*/ //Help
//    Can be used to log exceptions that occur at runtime.
//    Can be used to handle and recover from exceptions that occur at runtime.
    
    
    /**==========================================================================================================================================================*/
    /** Determine when casting is necessary.*/
//    For example if you want int to get the value from float or double, then you need to cast the variable to an int, the int will cut of the decimal and get the value.
//    If the max value or min value is out of the int values, then overflow will
//    You do not need to cast if for example, you want to give the int value to: long, double, float.
    static void intCasting(){
        byte num0 = 0;
        int num1 = 3;
        double num2 = 3.3;
        float num3 = 5.5F;
        
        
        num1 = (int) num2; //This will cut the decimal of from the double value and turn it to an int.
        num1 += (int) num3; //This will add the value of float, without the decimal value.
        System.out.println(num1);
        
        num0 = (byte) num1; //This casting is needed since the value of byte is less the int value.
    }
    
    
    /**==========================================================================================================================================================*/
    /** Develop code that makes use of polymorphism; develop code that overrides methods;
     * differentiate between the type of a reference and the type of an object.*/
    
    
    /**==========================================================================================================================================================*/
    /** Differentiate among checked exceptions, unchecked exceptions, and Errors.
     * All exceptions occur at runtime.
     * Checked exceptions are known to the compiler.
     * Unchecked exceptions cant be seen at compile time.
     * All exceptions can be recovered by using: try, catch or throw.
     * Errors indicate serious problems that an application should not try to catch.
     * Errors cannot be recovered by any handling techniques.
     * Errors are unchecked and mostly happen during runtime.
     * Out of memory and System crash error are some of the errors that might occur.
     * Exceptions and Errors are both subclasses of Throwable.
    */
    static void handleException() throws ArithmeticException{
        int a = 10;
        int b = scan.nextInt();
    
        //System.out.println(a / b);
        
        try{
            System.out.println(a / b);
        }catch(ArithmeticException ae)
        {
            ae.printStackTrace();
        }
        
        //throw new ArithmeticException();
    }
    
    
    /**==========================================================================================================================================================*/
    /** Import other Java packages to make them accessible in your code.*/ //Help
//     "import java.util.*" This will give you access to all the classes inside the util package, but only in this package,
//     "import java.util.Scanner" This will only give you access to the Scanner object and nothing else, since you specified what object you need in the class.
//     "import java.util.functions.*" You will not be able to get the classes in the util package this way.
    
    
    /**==========================================================================================================================================================*/
    /** Know how to read or write to object fields.*/
    
    
    /**==========================================================================================================================================================*/
    /** Manipulate data using the StringBuilder class and its methods.*/
    public static void stringBuilderManipulation(){
        String str = "java";
        StringBuilder sb = new StringBuilder();
        sb.append('j'); //Add a new character or string at the last index of the StringBuilder.
        sb.append('a');
        sb.append('v');
        sb.append('a');
        System.out.println(sb.toString());
        
        String sbStr = sb.toString();
    
        sb.deleteCharAt(1); //Remove a character at the specified index of the StringBuilder.
        System.out.println(sb.toString());
    
        sb.delete(0,1); //Delete all characters including first specified index and excluding the last specified index.
        System.out.println(sb.toString());
    
        System.out.println(sb.length()); //Get the length of the StringBuilder.(Has to be used in some way to be able to use the length() method)
    
        sb.insert(1,"sure"); //Insert new string at the selected index position in the StringBuilder.
        System.out.println(sb.toString());
    
        sb.replace(1,5, "bacon"); //Replace all characters including first specified index and excluding the last specified index.
        System.out.println(sb.toString());
        
        if(str.equals(sbStr)){
            System.out.println("Same content");
        }else{
            System.out.println("Not the same content");
        }
    }
    
    
    /**==========================================================================================================================================================*/
    /** Recognize common exception classes (such as NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException).*/
//    NullPointerException is used when there is no object to be found.
//    ArithmeticException is used when there is an arithmetic problem, for example: division with 0.
//    ArrayIndexOutOfBoundsException is used when the index called in the array is out of scope.
//    ClassCastException is used when casting of an object has failed at runtime.
    
    
    /**==========================================================================================================================================================*/
    /** //Test equality between Strings and other objects using == and equals().*/
    static void stringEquality(){
        String str1 = "Java";
        String str2 = "java";
        String str3 = str1;
        
        if(str3 == str2 || str3 == str1){ //Check if this is the same object.
            System.out.println("Same object");
        }else{
            System.out.println("Not the same object");
        }
        if(str3 == str1){
            System.out.println("str3 has the same object as str1");
        }
        if(str2 == str1){
            System.out.println("Always false");
        }
        if(str2.equals(str1)){ //Compare the content of two objects, this will be false if it does not have the exact same content.
            System.out.println("str2 does not have the same content as str1");
        }else{
            System.out.println("str2 does not have the same content as str1");
        }
        if(str2.equalsIgnoreCase(str1)){
            System.out.println("Ignoring upper and lowercase, it has the same content");
        }
        
    }
    
    
    /**==========================================================================================================================================================*/
    /** Use Java operators; use parentheses to override operator precedence.*/
//    1. "()" Parentheses has the highest priority, and the stuff happening inside will be calculated before anything else.
//    2. "/ and *" These two has the same priority, it depends which comes first in the calculation.
//    3. "+ and -".
    
    static int operatorPrecedence(){
        int i1 = 2;
        int i2 = 4;
        return (i1) + (i2); //This does not affect the priority.
    }
    
    
    /**==========================================================================================================================================================*/
    /** Use abstract classes and interfaces.*/
        /** Interfaces */
//        Implementing an interface to a class, is like adding a new blueprint that tells you what is needed in the class.
//        You can implement several interfaces to one class, but you cant extend more then one class.
//        You can extend other interfaces to one interface.
//        You can create static and default methods in an interface, but they will need a method body.
//        If you only add one static method to an interface this might be considered a functional interface.
    
    
    /**==========================================================================================================================================================*/
    /** Abstract Classes*/
//        If you implement an interface to an abstract class, you will not need to implement methods from the interfaces, you can add the methods you want from the interfaces.
//        If you create one abstract method, you need to make the class abstract, but if only the class is abstract then you don't need to make abstract methods.
//        Abstract Classes cannot be instantiated.
    
    
    /**==========================================================================================================================================================*/
    /** Use super and this to access objects and constructors.*/
//    Using super in the sub-class constructor, this will send the values from the sub-class to the parent constructor and return the result.
//    If the parent constructor has 2 arguments, then the super-call in the sub-class needs to return 2 arguments.
//    If there is several constructors in the super-class, then the super-call in the subclass will find the appropriate super-constructor.
    
    
    /**==========================================================================================================================================================*/
    /** Write a simple Lambda expression that consumes a Lambda Predicate expression.
     * Created a Predicate method, using lambda expression when calling the method
     * Predicate is an Interface and cannot be instantiated as an object.
     * The Predicate has only one method, a boolean method called test().
     * First we create a boolean method with a logical name of what we want to check.
     * Then we add the Predicate with Type as argument and give it a reference name.
     * Since the predicate will check a String, you can put an argument for the String you want to check.
     */
    public static boolean checkString(String pass, Predicate<String> string){
        return string.test(pass); //This will return true or false depending on the string that is checked in the lambda expression argument.
    }
    
    static void lambdaExpression(){
//        Here we call the Predicate method.
//        We add a string as the first argument, then we create a lambda expression to check if the string length is greater then 0.
//        If the string length is 0 or less, this will return false.
        checkString("glader", s -> s.length() > 0);
    }
    
    /**==========================================================================================================================================================*/
    static void wrapperClasses(){
        byte a1 = 1;
        String num = "2";
        Byte a = Byte.valueOf(num);
        Short b = new Short("2");
        Integer c = new Integer("3");
        long d = new Long("4");
        char e1 = 'e';
        Character e = new Character(e1);
        
        c = (int) d;
        d = c;
        
        double f = new Double("5.0");
        float g = new Float("6.0F");
        boolean bool = Boolean.TRUE;
    
        System.out.println(d);
    }
    
    
    /**==========================================================================================================================================================*/
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        OverLoads ol = new OverLoads(); //Making object from Inner Static Class
        LoopConstructs lc = new LoopConstructs();
        
//        stringManipulation();
        stringBuilderManipulation();
//        primitiveCasting();

//        lambdaExpression();

//        arrayList();
//        forEachLoop();
//        dateTime();
//        array();
//        multiArray();
//        System.out.println(ol.overload(2,4));
//        System.out.println(ol.overload(2,2,4));
//        System.out.println(ol.overload("Palle", "Kuling"));
//        System.out.println(lc.forLoop());
//        System.out.println(lc.forEachLoop());
//        stringEquality();
//        handleException();
//        intCasting();
        
//        ternaryOperator();
        
        
        //wrapperClasses();
        scan.close();
    }
    
    
    /**==========================================================================================================================================================*/
//    How to solve ternary operator
    public static void ternaryOperator() {
        int a = 1;
        int b = a++;
        int c = ++b;
        int d = a++;
        c += ++a;
        b = c++;
        /**
//        a = 4
//        b = 6
//        c = 7
//        d = 2
        */
        System.out.println(a + ", " + b + ", " + c + ", " + d);
        
        System.out.println(a > d ? (b > d ? b : c) : (c < d ? b : d));
//        First there is a boolean to check which is higher, since "a" is higher then "d", this will be true.
//        Now we check if b is higher then d, since b is higher this will return true.
//        The result of this ternary is b = 6, so it will return 6.
    }
}