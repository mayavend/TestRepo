        package Test;

import java.util.Scanner;
//This program calculates days in a given month and prints it to screen.
//Enter the month number between 1 to 12
// Account for leap year, only if necessary
// Leap year is divisible by (4 and not by 100) or divisible by 400


public class SwitchDats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number between 1 and 12:");
        int month = sc.nextInt();
        int numDays =0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays=31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numDays=30;
                break;

            case 2:
                System.out.println("Enter what year it is:");
                int year = sc.nextInt();
                if ((year%4 == 0 && !(year%100 == 0)) || year%400 == 0)
                    numDays=29;
                else
                    numDays=28;
                break;

            default:
                System.out.println("Invalid, re-enter");
                break;
        }

        System.out.println(numDays + " days");
    }
    }

//Mistakes to be corrected:
//Missing parenthesis for ((year%) && !(year%100 == 0))
//use variables such as numDays instead of using println every case statement
//check spaces and remove unnecessary lines between statements
//write psedocode first. That would have required the input of year
//watch for missing spaces between say 28days

