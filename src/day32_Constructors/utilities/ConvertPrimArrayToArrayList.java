package day32_Constructors.utilities;

import java.util.ArrayList;

public class ConvertPrimArrayToArrayList {
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }
}
