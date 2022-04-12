package day04_Variables;

public class Circle {


    public static void main(String[] args) {
        /*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter
                    radius=3.5
					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
         */

       // 1.declare the variables
       double radius = 5.5;
        double PI = 3.14;
        double area = radius * radius * PI;
        double Perimetre = 2 * radius * PI;

        // print out the variables
        System.out.println("radius = " + radius);
        System.out.println("PI = " + PI);
        System.out.println("area = " + area);
        System.out.println("Perimetre = " + Perimetre);







    }
}
