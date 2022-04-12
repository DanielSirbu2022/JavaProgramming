package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println(" Defaults constructor");// this is the default constructor
    }

    public ConstructorCalls(int a) {
        this();// execute default constractor
        System.out.println(" Constructor with int argumenmt");
    }

    public ConstructorCalls(String str) {
        this(10);// execute the default constructor and Contructor with int argument
        System.out.println(" Constructor with String argumenmt");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("---------------------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println( "-------------------------------");
        ConstructorCalls obj3 = new ConstructorCalls("Java");

    }
}
