package day32_Constructors;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3,5,8,true);

        System.out.println(carpet1);
       System.out.println(carpet1.calcCost());
        System.out.println("---------------------------------------");
        Carpet carpet2 = new Carpet(10, 20, 10, false);

        System.out.println(carpet2);
    }
}
