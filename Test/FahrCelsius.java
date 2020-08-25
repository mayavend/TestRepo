package Test;

//program to print a table of fahrenheit to celsius from 0 to 300 fahr
//in increments of 20. For example, it prints 0 17 then in next line 20  -6, etc.
// Formula is C = (5/9) (Fahr - 32)

public class FahrCelsius {
    public static void main(String[] args) {
        int fahr, celsius;
        int lower, upper, step;

        lower = 0;
        upper = 300;
        step = 20;

        fahr = lower;
        while (fahr <= upper) {
            celsius = 5 * (fahr - 32) / 9;
            // multiply first then divide because 5/9 integer division truncates.
            // to avoid this problem, use float instead of int for fahr and celsius
            System.out.println(fahr + "\t" + celsius);
            fahr = fahr + step;
        }
    }
}
