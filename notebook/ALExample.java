package notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ALExample {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        System.out.println("How long do you want l1 to be?");
        Scanner sd = new Scanner(System.in);
        int s1 = sd.nextInt();

        for(int i =0; i<s1; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number here");
            int num1 = sc.nextInt();
            l1.add(num1);
        }
        Collections.sort(l1);

        System.out.println("How long do you want l2 to be?");
        Scanner se = new Scanner(System.in);
        int s2 = se.nextInt();

        for(int j =0; j<s2; j++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter another number here");
            int num2 = sc.nextInt();
            l2.add(num2);
        }

        Collections.sort(l2);

        for (int k = 0; k < l1.size(); k++) {
            l3.add(l1.get(k));
        }
        for (int m = 0; m< l2.size(); m++) {
            l3.add(l2.get(m));
        }
        Collections.sort(l3);

        for (int n = 0; n < l3.size(); n++) {
            if (l3.get(n) == 5){
                l3.remove(l3.get(n));
            }
            if (l3.get(n) == 6){
                l3.remove(l3.get(n));
            }
        }

        for(Integer p: l3){
            System.out.print(p + " ");
        }
    }
}
