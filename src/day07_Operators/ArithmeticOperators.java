package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {


        System.out.println("-----------------------------");
        int num1 = 10;
        int num2 = 3;


        //  10 divided by 3 is equal to 3 with a remainder of 1
        int division = num1 / num2;
        System.out.println("division = " + division);
        int remainder = num1 % num2;
        System.out.println("remainder = " + remainder);
        // please print :  10 divided by 3 is equal to 3 with a remainder of 1

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);

        System.out.println(25 % 4);
        System.out.println("------------------------------------------");
        double m = 20.5;
        System.out.println("m = " + m);
        float n = 21.5f;
        System.out.println("n = " + n);


    }


}
