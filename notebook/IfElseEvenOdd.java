package notebook;

import java.util.Scanner;

public class IfElseEvenOdd {
    public static void main(String[] args) {
//        Check if a number is even or odd
//# if even print the number is even else print the number is odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }
}
