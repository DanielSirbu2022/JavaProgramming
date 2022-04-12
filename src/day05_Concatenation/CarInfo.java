package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        /*
        1. Create a class called CarInfo.java
2. Declare the following variables:
1. year 2018
2. make Toyota
3. model Camry
4. miles 50000
5. color Red
6. price $19000
3. Use concatenation to print the full info of the car in
the following format:
Year Make Model, Miles, Color, Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
         */

        int year = 2018;
        String make = "Toyota";
        String model = "Camry";
        int miles = 50000;
        String color = "Red";
        String price = "$19000";

        String carInfo = year + " " + make + " " + model + ", " + color + ", " + price ;

        System.out.println( carInfo);




    }




}
