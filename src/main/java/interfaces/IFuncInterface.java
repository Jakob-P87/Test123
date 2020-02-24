package interfaces;

public interface IFuncInterface{
    // An abstract function
    void abstractFun(int x);
    
    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
