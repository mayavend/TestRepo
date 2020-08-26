package newnotebook;

import java.util.Scanner;

public class MethodAvg {
    public static void main(String[] args) {
        Avg();
    }

    static void Avg(){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a value here");
            int a = sc.nextInt();
            sum = sum+a;
        }
        int average = sum/4;
        System.out.println(average);
    }
}
