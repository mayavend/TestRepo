package Test;

public class EscapeCharacter {
    public static void main(String[] args) {

        /* Print Hello "Maya" with Maya in double-quotes */
        System.out.println("Hello \"Maya\"");

        /* Print The folder is C:\Program Files\Java. */
        /* Notice two slashes \\ to print one \ in output because \ is a special
        character for java and you need two \\ so java treats \ like a literal */
        System.out.println("The folder is c:\\Program Files\\Java");

        /* Print \n. To do this, you need \\n
        because \n means newline, so to print \n as a literal use \\n */
        System.out.println("The newline is coded in java as \\n");

        /* Print \t. To do this, you need \\t
        because \t means tab, so to print \t as a literal use \\t */
        System.out.println("The tab is coded in java as \\t");

        /* If you don't put two slashes before and do just \t, then it will create a tab space */
        /* Create a tab between the worlds, Hello World */
        System.out.println("Here is a real tab: Hello\tWorld");

    }
}
