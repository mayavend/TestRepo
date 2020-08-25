package Test;

public class Constant1 {
    public static void main(String[] args) {
        final float PI = 3.14F;
        System.out.println(PI);

        /* if you try to change the value of pi as shown below, it will give an error "cannot assign a value to final variable pi */
         //PI = 3.1417F;
    }
}
