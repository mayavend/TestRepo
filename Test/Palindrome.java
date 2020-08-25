package Test;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check for palindrome: ");
        String word = sc.nextLine();

        int length = word.length();
        int forward = 0;
        int backward = length - 1;
        boolean palindrome = true;

        while (backward > forward) {
            char forwardChar = word.charAt(forward);
            char backwardChar = word.charAt(backward);
            if (forwardChar != backwardChar)
               palindrome = false;
            forward++;
            backward--;
        }
        if (palindrome != false)
                System.out.println("Your word is a palindrome");
        else
            System.out.println("Your word is not a palindrome");
    }
}
