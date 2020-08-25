package notebook;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum =0;
        for (int i = 0; i<numbers.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number here: ");
            int num = sc.nextInt();
            numbers[i] = num;
            sum = num + sum;
        }
        System.out.println(sum);
        //sum = num + sum
    }
}
