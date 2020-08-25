package notebook;

import java.util.Scanner;

public class WhileUser {
    public static void main(String[] args) {
        int i =0;
        int sum=0;
        int average =0;
        int product =1;
        while (i<3){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number here: ");
            int test = sc.nextInt();
            //System.out.println(test);
            i++;
            sum = test + sum;
            product = test * product;
        }
        average = (sum)/i;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: "+ average);
        System.out.println("The product is: " + product);
    }
}
