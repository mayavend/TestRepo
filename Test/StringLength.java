package Test;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String name = sc.nextLine();
        char letter;
        int count = 0;
        for (letter ='A'; letter <= 'Z'; letter++){
            int i;
            for (i = 0; i < name.length(); i++) {
                if (letter == name.charAt(i)) {
                    System.out.print(letter);
                    System.out.print(' ');
                    count++;
                    break;
                }
            }
           //System.out.println("The number is " + count);
        }
        System.out.println();
        System.out.println();
        System.out.println("There were " + count + " different letters.");
    }
}
