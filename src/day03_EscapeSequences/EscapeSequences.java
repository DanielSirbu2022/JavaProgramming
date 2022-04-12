package day03_EscapeSequences;
/*
 Escape sequences:Must be give with double quote
\n: means start a new line
\t: paragraph space(tab)
\\ : single back slash
\": double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java \n Python \n C#");

        System.out.println("-------------------------------------");

        System.out.println("Hello Cydeo\n How are you all today?\n Its nice to see youtoday.\n What class do we have next week.");
        System.out.println("---------------------------------");
        System.out.println("\tJava is Cool Programming Language");
        System.out.println("----------------");
        System.out.println("/ \\ ");// in order to print one backward slash we have to write two backward slashes
        System.out.println("------------------");
        System.out.println(" My favorite TV show is \"Game of Throne\"");// in order to print one quote we need to use the escape seqence


    }

}
