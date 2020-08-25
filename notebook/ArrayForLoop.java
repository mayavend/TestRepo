package notebook;

import java.util.Scanner;

public class ArrayForLoop {
    //take user input for 5 values, print

    public static void main(String[] args) {
        int[] num = new int[5];
        int [] m = new int [5];

        for (int i =0; i<num.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number here");
            int number = sc.nextInt();
            num [i] = number;
        }

        for (int j =0; j<m.length; j++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number here");
            int integ = sc.nextInt();
            m [j] = integ;
        }

        for (int t =0; t<num.length; t++){
            System.out.println(num[t]+m[t]);
        }
    }
}
