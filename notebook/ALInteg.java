package notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ALInteg {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for (int m =0; m<5; m++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number here");
            int i = sc.nextInt();
            num.add(i);
        }
        Collections.sort(num);
        for(int n: num){
            System.out.print(n + " ");
        }
    }
}
