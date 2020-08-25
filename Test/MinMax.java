package Test;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        System.out.println("Enter a value: ");
        int min, max, value;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();


        min = max = value;
        for (int count = 2; count <= 10; count++) {
            System.out.print("Enter another value: ");
            value = sc.nextInt();
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }
        System.out.println("Lowest: " + min);
        System.out.println("Highest: " + max);
    }
}