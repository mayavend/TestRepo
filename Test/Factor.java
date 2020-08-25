package Test;


import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factors");
        int n = sc.nextInt();

        System.out.print("The prime factorization of " + n + " is: ");

        // for each potential factor
        for (int factor = 2; factor*factor <= n; factor++) {
            System.out.println("factor = " + factor);
            // if factor is a factor of n, repeatedly divide it out
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n = n / factor;
            }
        }

        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}
