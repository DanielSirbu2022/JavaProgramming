package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please  enter your age");
        int age =input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName =input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();

        System.out.println("Enter your School name :");
        input.nextLine();
         String schoolName = input.nextLine();

        System.out.println("schoolName = " + schoolName);
        System.out.println("gpa = " + gpa);
        input.close();




        /*
       1 Ask user to enter the age.
       2.Ask user to enter full name
         */



    }
}
