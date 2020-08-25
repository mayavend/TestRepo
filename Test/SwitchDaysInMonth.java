package Test;

import java.util.Scanner;
//
//This program calculates days in a given month and prints it to screen. Enter the month number between 1 to 12
// Account for leap year, only if necessary
// Leap year is divisible by (4 and not by 100) or divisible by 400
//

public class SwitchDaysInMonth {
    public static void main(String[] args) {

        int daysInMonth=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates days in a given month. Enter the month number between 1 to 12");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11: // alternate way to combine case
                daysInMonth = 30;
                break;
            case 2:
                System.out.println("Enter the full 4-digit year");
                int year = sc.nextInt();

                if  (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) // leap year
                    daysInMonth = 29;
                else
                    daysInMonth = 28; // non leap year
                break;
            default:
                System.out.println("Invalid month was entered. Please rerun the program");
                // No break statement needed here for default
        }
        System.out.println("The days in month is: " + daysInMonth);

    }
}
