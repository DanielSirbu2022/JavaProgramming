package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = input.next();

        System.out.println("Enter your street name");
        input.nextLine();
        String streetName = input.nextLine();

        System.out.println("Enter city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String State = input.next();



        System.out.println("Enter your zip code");
        String zipCode= input.next();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("State = " + State);
        System.out.println("zipCode = " + zipCode);
input.close();



        /*
        1.Enter full name
        2.Enter your building number
        3.Enter your street name
        4.Enter city name
        5.Enter your state
        6.Enter your zip code
        7. Display shipping adress

         */
    }
}
