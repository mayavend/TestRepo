package notebook;

import java.util.Scanner;

public class ForUserSum {
    public static void main(String[] args) {
        double i;
        double sum=0;
        int numberInteger=0;
        String q = "q";
        for(i=0; i<10; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number here, press q to exit: ");
            String number = sc.next();

            if (number.equals(q)){
                break;
            }
            numberInteger = Integer.parseInt(number);
            sum = numberInteger + sum;

        }
        double average = sum/i;
        System.out.println(average);
    }
}
