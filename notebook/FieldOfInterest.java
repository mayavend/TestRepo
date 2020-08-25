package notebook;

import java.util.Scanner;

public class FieldOfInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();
        System.out.println("Enter your roll number:");
        int rollNumber = sc.nextInt();
        System.out.println("Enter your field of interest:");
        String fieldOfInterest = sc.next();
        System.out.println("Hey, my name is " + fullName + "and my roll number is " + rollNumber + "." + "My field of interest are" + fieldOfInterest);
    }


//    Take name, roll number and field of interest from user and print in the format below :
//    Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
}
