package Test;

//program to print a table of fahrenheit to celsius from 0 to 300 fahr
//in increments of 20. For example, it prints 0 17 then in next line 20  -6, etc.
// Formula is C = (5/9) (Fahr - 32)

// Modified to print Fahr as int, but Celsius with one decimal

public class FahrCelsiusFloatFor {
    public static void main(String[] args) {
        double fahr, celsius;

        for (fahr = 0; fahr <= 300; fahr = fahr + 20){

            celsius = (5.0/9.0) * (fahr - 32.0);
            // 5.0/9.0 is not truncated unless int division.
            // fahr - 32 itself would have converted 32 to double before doing the arithmetic operation
            // but doing fahr - 32.0 makes it visual for the reader as well.

            System.out.printf("%3.0f \t %6.1f", fahr, celsius); //at least 3 char wide with no decimal. printf function is used
//            System.out.print("\t"); // tab separates
//            System.out.printf("%6.1f", celsius); // at least 6 char wide, with one digit after decimal
            System.out.println(); // prints new line
        }
    }
}
