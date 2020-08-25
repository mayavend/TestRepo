package notebook;

import java.util.Scanner;

public class SmallTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a:");
        int a = sc.nextInt();
        System.out.println("Enter a value for b:");
        int b= sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("a= "+ a + " and b= " +b);
    }
}
