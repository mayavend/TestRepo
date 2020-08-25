package notebook;

import java.util.Scanner;

public class WorkingWithScanners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length");
        int length = sc.nextInt();
        System.out.println("Enter a width");
        int width = sc.nextInt();
        int area = length*width;
        int perimeter = 2*length + 2*width;
        System.out.println("The area for the rectangle is " + area + " and the perimeter is " + perimeter);


    }
}
