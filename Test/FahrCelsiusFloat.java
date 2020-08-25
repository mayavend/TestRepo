package Test;

//program to print a table of fahrenheit to celsius from 0 to 300 fahr
//in increments of 20. For example, it prints 0 17 then in next line 20  -6, etc.
// Formula is C = (5/9) (Fahr - 32)

// Modified to print Fahr as int, but Celsius with one decimal

public class FahrCelsiusFloat {
    public static void main(String[] args) {
        double fahr, celsius; // declare fahr, celsius as double
        int lower, upper, step;

        lower = 0;
        upper = 300;
        step = 20;

        fahr = lower;
        while (fahr <= upper) {
            celsius = (5.0/9.0) * (fahr - 32.0);
            // 5.0/9.0 is not truncated unless int division.
            // fahr - 32 itself would have converted 32 to double before doing the arithmetic operation
            // but doing fahr - 32.0 makes it visual for the reader as well.

            System.out.printf("%3.0f", fahr); //at least 3 char wide with no decimal. printf function is used
            System.out.print("\t"); // tab separates
            System.out.printf("%6.1f", celsius); // at least 6 char wide, with one digit after decimal
            //You can combine all of above to one statment using printf("%3.0f \t %6.1f", fahr, celsius);
            System.out.println(); // prints new line
            fahr = fahr + step;
        }
    }
}
