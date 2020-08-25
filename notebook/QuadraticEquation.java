package notebook;

import java.util.Scanner;

public class QuadraticEquation {

        public static void main(String[] args) {

            int temp = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter coefficient a");
            int a = sc.nextInt();
            System.out.println("Enter coefficient b");
            int b = sc.nextInt();
            System.out.println("Enter coefficient c");
            int c = sc.nextInt();

            double d = (b*b) - (4 * a * c);

            if ( a == 0) {
                System.out.println("Error: co-efficient \"a\" cannot be zero");
            } else if ( d > 0) {
                double x1 = (((-1) * b) + Math.sqrt(d)) / (2 * a);
                double x2 = (((-1) * b) - Math.sqrt(d)) / (2 * a);
                System.out.println( "x1 is " + x1);
                System.out.println( "x2 is " + x2);
            } else if ( d == 0) {
                double x1 = ((-1) * b) / (2 * a);
                System.out.println("x1 is " + x1);
            } else
                System.out.println("No solutions");
        }

    }

