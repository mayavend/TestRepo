package Test;

public class IfElseGrades {
    public static void main(String[] args) {
        int grade = 93;

        if (grade > 90)
            System.out.println("A");
         else if (grade > 80)
            System.out.println("B");
         else if (grade > 70)
            System.out.println("C");
         else if (grade > 60)
            System.out.println("D");
         else {
            System.out.println("F");
            System.out.println("Must repeat class");
        }
        }
    }
