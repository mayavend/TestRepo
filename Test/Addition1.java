package Test;

public class Addition1 {
    public static void main(String[] args) {
        /* Addition */
        int result = 10 +3;
        System.out.println(result); // prints 13
        /* Subtraction */
        int result1 = 10 -3;
        System.out.println(result1); // prints 7
        int result2 = 10*3;
        System.out.println(result2); // prints 30
        int result3 = 10/3;
        System.out.println(result3); // prints 3, only whole number

//        float result7 = 10/3F;

        double result4 = (double)10/(double)3;
        System.out.println(result4); // prints 3, only whole number

        int x = 1;
        //postfix increment
        x++;
        System.out.println(x); // prints 2
        //prefix increment
        ++x;
        System.out.println(x); //prints 3

        int a = 1;
        int b  = a++;
        System.out.println(a); // prints 2
        System.out.println(b); // prints 1 because postfix increment

        int c=1;
        int d=++c;
        System.out.println(c); // prints 2
        System.out.println(d); // prints 2 because prefix increment

        int e = 1;
        e = e + 2; // to increment by 2;
        System.out.println(e);

        int f = 1;
        f += 2; // another way to increment by 2
        System.out.println(f);
    }
}
