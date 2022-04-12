package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        
        
        
        
        int[]number={10, 5, 4, 20, -1, 0};
        int min =number[0];


        for (int i = 0; i < number.length; i++) {
            if (number[i]< min) {
            min=   number[i]  ;

            }
        }
        System.out.println("min = " + min);
        
    }
}
