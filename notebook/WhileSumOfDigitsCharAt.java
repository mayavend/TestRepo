package notebook;

import java.util.Scanner;

public class WhileSumOfDigitsCharAt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        String number = sc.next();
        int l = number.length();


        int sum =0;
        while (l>0){
            char numberChar = number.charAt(l-1);
            String num = String.valueOf(numberChar);
            int numberInt = Integer.parseInt(num);
            sum = sum + numberInt;
            l--;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
