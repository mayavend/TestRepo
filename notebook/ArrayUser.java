package notebook;

import java.util.Scanner;

public class ArrayUser {
    public static void main(String[] args) {

        String[] list1 = new String[5];
        String[] list2 = new String[5];


        for (int i =0; i<5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number here");
            String num1 = sc.next();

            list1[i] = num1;
        }

        for (int j =0; j< list1.length; j++){
            System.out.println(list1[j]);
        }

        for (int k =0; k< list2.length; k++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a second number here");
            String num2 = sc.next();

            list1[k] = num2;
        }
    }
}
