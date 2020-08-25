package Test;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your letter grade");

        String grade = sc.next().toUpperCase(); // convert to uppercase

        switch (grade) {
            case "A":
                System.out.println("Excellent job");
                break;
            case "B":
                System.out.println("Good job");
                break;
            case "C":
                System.out.println("Average job");
                break;
            case "D":
                System.out.println("Work hard to improve");
                break;
            case "F":
                System.out.println("Redo your assignment to pass");
                break;
            default:
                System.out.println("Invalid Grade, re-enter");
        }
        System.out.println("Your grade is: " + grade);

    }
}
