package Test;
import java.util.Scanner;

public class ComoundInt {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter principal : ");
            float principal = scanner.nextFloat();

            System.out.println("Enter rate : ");
            float rate = scanner.nextFloat();

            System.out.println("Enter time : ");
            float time = scanner.nextFloat();

            // Calculate compound interest
            double result = principal * Math.pow((1 + rate / 100), time);

            System.out.println("Compound interest : " + result);

        }

    }

