package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

      // Below is Implicit castig. Assigning the smaller data type to a biger type. Is done automatic by compiler
        byte a = 100;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;


     // Explicit castig need to be done manually by converting larger data to a smaller data

        int x = 55;
        short y = (short)x;
        double division = x / y ;


        System.out.println( division);


        long j = 1000000;
        short k = (short)j;
        System.out.println(j+" : "+k);



     double l = 2.5;
     float m = (float)l;
        System.out.println(l + " : "+ m);




        double n = 10.8;
        int s = (int)n;
        System.out.println(n + " : "+ s);

        System.out.println("--------------------------------------");



    double d1 = 20.5;
    short s1 = (short) d1;
        System.out.println(d1 + " : " + s1);


        float f1 = 30.5F;
        long l1 = (long) f1;




    }




}
