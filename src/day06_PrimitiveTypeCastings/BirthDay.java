package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {
        /*
        1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
         */

// declare the variables:
        String name ="John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;

         String wasBorn = name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear;

        System.out.println(wasBorn);
    // My favorite  book is

        String book = "Rich Dad and the Poor Dad";
        System.out.println("My Favorite book is " +"\""+ book + "\"" );


    }




}
