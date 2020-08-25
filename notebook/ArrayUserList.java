package notebook;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUserList {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for (int i =0; i<4; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number here");
            String num1 = sc.next();
            list1.add(num1);
        }
        System.out.println(list1);


        for (int i =0; i<4; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input more numbers here");
            String num2 = sc.next();
            list2.add(num2);
        }
        System.out.println(list2);

        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }

        System.out.println(list3);
    }
}
