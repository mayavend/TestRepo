package notebook;

import java.util.Scanner;

public class IfElseSquare {
//    Take values of length and breadth of a rectangle from user and check if it is square or not.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value for the length:");
    int length = sc.nextInt();
    System.out.println("Enter a value for the breadth:");
    int breadth = sc.nextInt();

    if (length==breadth){
        System.out.println("This is a square");
    }
    else {
        System.out.println("This is not a square");
    }
}
}
