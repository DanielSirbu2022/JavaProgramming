package day04_Variables;

public class Curencies {

    public static void main(String[] args) {
        /*convert 1000 dollar in euro,pound
        euro= 1.16 dollar
        pound = 1.36 dollar

         */
    int dollar = 1000;
    double lira = 9.53;
    double euro = 1.16;
    double pound = 1.36;
    double dollarToLira = dollar * lira;
    double dolarToEuro = dollar * euro;
    double dolarToPound = dollar * pound;

        System.out.println("lira = " + lira);
        System.out.println("dollar = " + dollar);
        System.out.println("euro = $" + euro);
        System.out.println("pound = $" + pound);
        System.out.println("dolarToEuro = " + dolarToEuro);
        System.out.println("dolarToPound = " + dolarToPound);
        System.out.println("dollarToLira = " + dollarToLira);


    }
}
