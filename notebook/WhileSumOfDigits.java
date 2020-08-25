package notebook;

import java.util.Scanner;

public class WhileSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        String number = sc.next();
        int l = number.length();
        int numberInt =  Integer.parseInt(number);

        int firstDivInt;
        int sum =0;
        firstDivInt = numberInt;

        while (l>0){
            int units = firstDivInt%10; //units = 3
            double firstDiv = firstDivInt/10.0; //13.5
            firstDivInt= (int)firstDiv; // firstDivInt = 13
            sum = sum + units; // 0 = 0+5
            l--;
        }
        System.out.println("The sum of the digits is " + sum);
     }
}
