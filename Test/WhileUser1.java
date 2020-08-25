package Test;

import java.util.Scanner;

public class WhileUser1 {
    public static void main(String[] args) {
        //int i=0;
        int sum =0;
        int oddSum =0;
        int posSum=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            sum = sum+number;
            if (number == 0){
                break;
            }
//            else if (number%2 ==1) {
//                oddSum = oddSum + number;
//            }
            else if (number > 0){
                posSum = posSum + number;
            }

         //   i++;
        }
        System.out.println("The sum is " + sum);
//        System.out.println("The sum of the odd numbers is " + oddSum);
        System.out.println("The sum of the positive numbers is " + posSum);
    }
}
