package Test;

import java.util.Scanner;

public class AgeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("adult");
        }
        else if (age<9){
            System.out.println("baibee");
        }
        else if (age<=15){
            System.out.println("baby");
        }
        else {
            System.out.println("teen");
        }


    }
}
