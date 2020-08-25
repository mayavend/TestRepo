package Test;

import java.util.Scanner;

// Input 3 integers and display in ascending sort

public class SwapThreeNumbers {
    public static void main(String[] args) {

        int temp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        if (a > b) {
            System.out.println("First if: a > b");
            temp = a;
            a = b;
            b = temp;
            System.out.println("a is " + a);
            System.out.println("b is " + b);
        }
        if (b > c) {
            System.out.println("Second if: b > c");
            temp = b;
            b = c;
            c = temp;
            System.out.println("b is " + b);
            System.out.println("c is " + c);
        }
        if (a > b) {
            System.out.println("Third if");
            temp = a;
            a = b;
            b = temp;
            System.out.println("a is " + a);
            System.out.println("b is " + b);

        }

        System.out.println( "The ascending sort order is: " + a + "\t" + b + "\t" + c);
    }

}
