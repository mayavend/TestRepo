package notebook;

import java.util.Scanner;

public class IfElseRange {
    public static void main(String[] args) {
//        # Check if a number is in a given range.
////# Take input for number, starting number and ending number.
////# if the number is in range, print in range else
////# print out of range.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Enter a starting number:");
        int startingNumber = sc.nextInt();
        System.out.println("Enter an ending number:");
        int endingNumber = sc.nextInt();

        if (startingNumber<number && number<endingNumber){
            System.out.println("In range");
        }
        else{
            System.out.println("Out of range");
        }
    }
}
