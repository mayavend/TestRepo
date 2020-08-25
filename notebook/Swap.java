package notebook;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a");
        int a = sc.nextInt();
        System.out.println("Enter a value for b");
        int b = sc.nextInt();
        int temp= a;
        a = b;
        b = temp;
        System.out.println( a + "\n" + b);
    }


//    Take input for a and b
//    swap the 2 numbers
//    Sample input
//    a=3
//    b=2
//    Expected Output:
//    a=2
//    b=3
}
