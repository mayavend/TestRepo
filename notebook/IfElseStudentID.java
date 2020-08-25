package notebook;

import java.util.Scanner;

public class IfElseStudentID {
//    Develop a java application, which will help students understand a concept
//    of a particular school subject at a particular level.
//    The subject, and level which you must address, will be dependent on the
//    last two digits of your student ID (see instructions below).
//    Instructions for selecting concepts to address:
//    From the following Table 1 and based on the second last digit of your
//    student id please select the subject your app should address.
//
//    Table 1
//    Digit
//    Subject
//0 or 1
//    Maths
//2 or 3
//    Geography
//4 or 5
//    History
//6 or 7
//    Irish
//8 or 9
//    Science
//
//    From the following Table 2 and based on the last digit of your student
//    id please select the level of study app should address.
//    Table 2
//    Digit
//    Level of education
//0, 1, 2
//    Primary School
//3, 4, 5
//    Secondary School – Junior Cycle
//6, 7, 8, 9
//    Secondary School – Senior Cycle
//
//    Example: If your student ID were x17068381 then your subject would be
    // studentID/10 convert to int
    //studentID%10
//    Science (second last digit is “eight”) and your
//    education level would be Primary School (last digit is “one”).
//    Thus, you should develop an application, which
//    aims to help students in primary school to understand some concept
//    of science appropriate to their stage of study

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student id here:");
        int studentID = sc.nextInt();
        double divideStudentID = studentID/10;
        int newStudentId = (int) divideStudentID;
        double remainderID = divideStudentID%10;
        int study = studentID%10;

        if (remainderID==0 || remainderID==1){
            System.out.println("Maths");
        }
        else if (remainderID==2 || remainderID==3){
            System.out.println("Geography");
        }
        else if (remainderID==4 || remainderID==5){
            System.out.println("History");
        }
        else if (remainderID==6 || remainderID==7){
            System.out.println("Irish");
        }
        else {
            System.out.println("Science");
        }

        if (study==0 || study==1 || study==2){
            System.out.println("Primary School");
        }
        else if (study==3 || study==4 || study==5){
            System.out.println("Secondary School - Junior Cycle");
        }
        else{
            System.out.println("Secondary School - Senior Cycle");

        }
    }
}
