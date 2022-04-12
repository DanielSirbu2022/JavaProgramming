package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        /*
        We will use one data type for each variables.


         name
        buildingNumber
        streetName
        city
        state
        zipCode



        String name = "James King";
        String buildingNumber = "1123B";
        String streetName = "Jones Branch Dr";
        String city = " McLean ";
        String state = "VA";
        String zipCode = "22031A";

      /*


      // A easier way to declare is :
       */


       String name = "James King",buildingNumber = "1123B",streetName = "Jones Branch Dr", city = "McLean", state = "VA",
                                  zipCode = "22031A";




     /*
      Print the variablesas:
      Jimmy King
      1123B Jones Branch Dr
      McLean VA 22031A

      */
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode);


        // All the shipping address can be declared into one variable . Example:

        String shippingAddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode;

        System.out.println( shippingAddress);


    }



}
