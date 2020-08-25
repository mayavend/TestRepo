package Test;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        do {
            System.out.println("Enter a word. Type \"quit\" to terminate");
            input = sc.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
