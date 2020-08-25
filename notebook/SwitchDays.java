package notebook;

import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        //weekday number to calculate the weekday name:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 here: ");
        int day = sc.nextInt();
        //int day=0;
        String numberOfDay = "";
        switch(day){
            case 1:
                numberOfDay = "Monday";
                break;
            case 2:
                numberOfDay= "Tuesday";
                break;
            case 3:
                numberOfDay = "Wednesday";
                break;
            case 4:
                numberOfDay = "Thursday";
                break;
            case 5:
                numberOfDay = "Friday";
                break;
            case 6:
                numberOfDay = "Saturday";
                break;
            case 7:
                numberOfDay = "Sunday";
                break;
            default:
                System.out.println("Try again");
        }
        System.out.println("Your day is " + numberOfDay);
    }
}
