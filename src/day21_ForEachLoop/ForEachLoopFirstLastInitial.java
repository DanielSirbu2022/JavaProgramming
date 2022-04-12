package day21_ForEachLoop;

public class ForEachLoopFirstLastInitial {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for(String  each : words ){
           System.out.println( each.charAt(0)+ ""+ each.charAt( each.length()-1 )  );
        }
      //  for (int i = 0; i < words.length; i++) {
        //    System.out.println(words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1));
       // }


    }


}