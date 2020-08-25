package notebook;

import java.util.Scanner;

public class IfElseVowel {
//    Write a Python program to check whether an alphabet is a vowel or consonant. Go to the editor
//# Expected Output:
//
//            # Input a letter of the alphabet: k
//# k is a consonant.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a letter of the alphabet");
    String letter = sc.next();
    if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
        System.out.println(letter + " is a vowel");
    }
    else{
        System.out.println(letter + " is a consonant");
    }

}
}
