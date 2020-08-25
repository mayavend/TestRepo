package Test;

public class MathFunctions {
    public static void main(String[] args) {

        /* Ceiling returns the closest integer greater than the number */
        int result1 = (int)Math.ceil(1.1F);
        System.out.println(result1); //prints 2. It is closest integer > 1.1

        /* Floor returns the closest integer Less than the number */
        int result2 = (int)Math.floor(1.1F);
        System.out.println(result2); //prints 1. It is closest integer < 1.1

        /* max returns the larger of 2 numbers */
        int result3 = Math.max(1,2);
        System.out.println(result3); //prints 2

        /* max returns the larger of 2 double; overloaded method as above */
        double result4 = Math.max(1.4, 2.7);
        System.out.println(result4); //prints 2.7

        /* min returns the larger of 2 numbers; overloaded method  */
        double result5 = Math.min(1.4, 2.7);
        System.out.println(result5); //prints 1.4

        /* random number generator less than 1 */
        double result6 = Math.random();
        System.out.println(result6); //prints some random number

        /* random number generator between 0 to 100*/
        double result7 = Math.random() * 100;
        System.out.println(result7); //prints some random number 0-100 in double

        /* random integer number generator between 0 to 100*/
        int result8 =  (int) Math.round(Math.random() * 100);
        System.out.println(result8); //prints some random number 0-100 in int

        /* random integer number generator between 0 to 100 - alternate way*/
        int result9 =  (int) Math.random() * 100;
        System.out.println(result9); //prints 0 always. WHY????

        /* random integer number generator between 0 to 100 - CORRECTED alternate way*/
        int result10 =  (int) (Math.random() * 100);
        System.out.println(result10); //prints correct int between 0-100

    }
}
