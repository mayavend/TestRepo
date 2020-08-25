package Test;

import java.util.Scanner;

public class SortBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter another number: ");
        int b = sd.nextInt();
        Scanner se = new Scanner(System.in);
        System.out.println("Enter a third number: ");
        int c = se.nextInt();

        int temp;
        if (a>b){
            temp = a;
            a =b;
            b = temp;
        }

        if (b>c){
            temp = b;
            b = c;
            c = temp;
        }

        if (a>b){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + " " + b + " " + c);

    }
}
