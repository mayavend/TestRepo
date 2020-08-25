package Test;

import java.util.Scanner;

public class Quadi {
    public static void main(String[] args) {
        //-b +- sqrt (b^2 - 4ac) / 2a
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a: ");
        double a = sc.nextDouble();
        System.out.println("Enter a value for b: ");
        double b = sc.nextDouble();
        System.out.println("Enter a value for c: ");
        double c = sc.nextDouble();
        double d = Math.sqrt(Math.pow(b, 2) - 4*a*c);
        double r1 = (-1*b + d)/(2*a);
        double r2 = (-1*b -d)/(2*a);
        if (a==0){
            System.out.println("Invalid");
        }
        else {
            System.out.println("The discriminant is: " + d);
            System.out.println("Root 1 is: " + r1);
            System.out.println("Root 2 is: " + r2);
        }
    }
}
