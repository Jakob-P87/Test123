package se.lexicon.jakob;

public class TestClass{
    
    public static void main(String[] args) {
        
        int i = -66;
        
        double d = 5000.0;
        Integer I = new Integer("50");
        Double D = new Double("50.0");
        Short S = new Short("5");
        Float F = 20.0F;
        Byte B = new Byte("5");
        char c = 'a';
        String str = "abc";
        
        i = (int) B;
        B = (byte) i;
        d = I;
        S = (short) i;
        D = (double) F;
    
        System.out.println(c);
    }
}
