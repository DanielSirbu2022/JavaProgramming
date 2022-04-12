package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // Integer data
      //age: 38 years old
        byte age =38;
     // weight:160 pounds
        short weight = 160; // 160 is within the range of short

        // salary : 10000$
        int salary = 100000; // 100000 is out of short range and within the int range

     // asset: 3_333_333_333
        long asset = 3_333_333_333L; // only for long data type we add L


        // tax: 0.26
        float tax = 0.26F; // only for float we have to add F, because by default java is using double
        double PI = 3.14;

        //#

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 =35000;
        // example
        char gender = 'F';
        System.out.println("gender = " + gender);

        char grade ='F';

        char yesNo = 'Y';
        // boolean used for True or False

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100>30;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);


        // STRING TYPE
        //  Example

        String name =" Wooden Spoon";
        String city = "Mclean";

// one variable name can only be given to one variable

        double salaryAfterTax = 2.5;








    }



}
