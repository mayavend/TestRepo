package Test;

import java.util.Scanner;

public class HarmonicMaya {
    public static void main(String[] args) {
        // 3: 1 + 1/2 + 1/3
        double n;
        double sum =0;
        for (n=10; n>0; n--){
            double frac = 1/n;
            sum = frac + sum;

        }
        System.out.println(sum);
    }
}
