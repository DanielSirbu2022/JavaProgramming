package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        //                0  1  2  3  4  5  6

        for (int i = 0; i < numbers.length; i++) { // i: indexes of the array
            int eachElement = numbers[i];          // get the index number to find the element
            System.out.println(eachElement);
        }

        System.out.println("---------------------------------");

        for (int each :numbers){
            System.out.println(each);
        }


        // for (int each : numbers) { // each: elements of the array
        //  System.out.println(each);
        // }


    }
}