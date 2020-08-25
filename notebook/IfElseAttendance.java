package notebook;

import java.util.Scanner;

public class IfElseAttendance {
//    # A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//            # Take following input from user
//# Number of classes held
//# Number of classes attended.
//            # And print
//# percentage of class attended
//# Is student is allowed to sit in exam or not.

    //    IF the attendance is less than 75%
//            # Ask user if he/she has medical cause or not ( 'Y' or 'N' )
//# Allow student to sit if he/she has medical cause and print accordingly.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many classes have been held?");
    double classHeld = sc.nextDouble();
    System.out.println("How many classes have you attended?");
    double classAttend = sc.nextDouble();
    double percentage = classAttend/classHeld*100;
    System.out.println(percentage);
    if (percentage>75){
        System.out.println("allowed to attend");
    }
    else{
        System.out.println("Do you have a medical cause? Type Y or N:");
        String medical = sc.next();
        if (medical.equals("Y")){
            System.out.println("excused from attending");
        }
        else{
            System.out.println("not allowed to attend");
        }

    }
}


}
