package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        /*
        1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
         */

        float averageScore = 20.5f;

        byte num1 = (byte) averageScore;    // This is explicit casting
        short num2 = (short) averageScore;  // this is also explicit casting
        int num3 = (int)averageScore;
        long num4 = (long)averageScore;
        float num5 = averageScore;           // float to float= this is No Casting
        double num6 = averageScore;          // tjis is implicit casting.

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }


}
