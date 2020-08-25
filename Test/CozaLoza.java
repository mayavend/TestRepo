package Test;
import java.util.Scanner;

public class CozaLoza {

    public static void main(String[] args) {
        Scanner clw = new Scanner(System.in);
        int n,i;

        n = clw.nextInt();
        System.out.println("Printing Coza, Loza, Woza \n when numbers are divisible by 3, 5, 7\n");

        for(i=1;i<=n;i++) {

            if(i%3 == 0) {
                System.out.print("Coza ");
            }
            else if(i%5 == 0) {
                System.out.print("Loza ");
            }
            else if(i%7 == 0) {
                System.out.print("Woza ");
            }
            else {
                System.out.print(i + " ");
            }

            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }

}