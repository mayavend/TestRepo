package notebook;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for a");
        int a = sc.nextInt();
        System.out.println("Enter a number for b");
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
