package Test;

public class TemperatureWhile {
//  c=  5 * (fahr - 32) / 9;
public static void main(String[] args) {
    double celsius;
    float fahrenheit;
    int step;

    fahrenheit= 0;

    step=20;

    while (fahrenheit<=300) {
        celsius= (5.0/9.0)*(fahrenheit-32);
        System.out.printf("%3.0f \t %6.1f", fahrenheit, celsius);
        System.out.println();
        fahrenheit=fahrenheit+step;
    }
    }
}

