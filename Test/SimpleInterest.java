package Test;

import java.util.Scanner;
//7%
// P(1+r)^n
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount here:");
        int amount = sc.nextInt();
        System.out.println("Enter number of years:");
        int years = sc.nextInt();

        double simple = amount*(1+0.07*years);
        System.out.println(simple);

        double compound = amount*(Math.pow(1.07, years));
        //System.out.println(compound);
        System.out.printf("%10.2f", compound);
    }
}