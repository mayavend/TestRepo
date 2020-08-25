package Test;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here:");
        int number = sc.nextInt();
        int divisorCount =0;
        int constant= number;
        for (number=1; number<= constant; number++){
            if (constant%number==0){
                System.out.println(number);
                divisorCount++;
            }
        }
        System.out.println("The number of divisors are: " + divisorCount);
    }
}
