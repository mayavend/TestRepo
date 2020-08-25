package Test;

public class AsteriskPrint {
    public static void main(String[] args) {
        int LINES = 10; 
        for (int line=0; line < LINES; line++)
        {
            for (int space=0; space < line; space++)
                System.out.print (" ");
            System.out.println ("*");
        }
        System.out.println();
    }
}
