package Test;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("you are an adult");
        else if (age < 9)
            System.out.println("You are a bybee");
        else if (age < 16)
            System.out.println("you are a baby");
        else
            System.out.println("You are a teen");

    }
}
