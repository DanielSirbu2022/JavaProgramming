package day05_Concatenation;

import java.security.spec.RSAOtherPrimeInfo;

public class FullName {
    public static void main(String[] args) {

        String firstName ="Aaron";
        String lastName = "Daniel";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;



        String fullName = firstName +" "+ lastName;


      // Full name of the person is ___
        System.out.println("Full name of the person is " + fullName);

// _____ is ____ years old

        System.out.println(fullName + " is " + age + " years old");

// FullName is JobTitle +,works at + CompanyName and fullName salary is salary

        System.out.println(fullName +" is " + jobTitle +", works at " + companyName + " and "
                + fullName + "'s salary is $" + salary );






    }



}
