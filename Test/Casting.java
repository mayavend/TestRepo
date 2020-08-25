package Test;

public class Casting {
    public static void main(String[] args) {
        short x = 1;
        int y = x + 2; //implicit casting short to int
        /* byte->short->int->long, all automatic conversions */
        System.out.println(y); // y=3

        double a = 1.1;
        double b = a + 2; //Java casts 2 (int) to 2.0(double)
        System.out.println(b); //prints 3.1

        double c = 1.7;
        int d = (int)c + 2; //explicit casting to display result as int
        System.out.println(d); //prints 3

        /* Example below converts between non-compatible data types using wrapper class */
        String e = "1";
        /* Below, Integer is the wrapper class for "String" primitive data type. It takes a string and converts to integer */
        int f = Integer.parseInt(e) + 2;
        System.out.println(f);
 //       Short.parseShort(e); to convert to short
   //     Float.parseFloat(e); to convert to Float

        String g = "1.1";
        /* Below, Double is the wrapper class for "String" primitive data type. It takes a string and converts to Double */
        double h = Double.parseDouble(g) + 2;
        System.out.println(h); // prints 3.1
    }
}
