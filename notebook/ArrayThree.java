package notebook;

import java.util.Scanner;

public class ArrayThree {

        public static void main(String[] args) {
            String[] list0 = new String[3];
            String[] list1 = new String[3];
            String[] list2 = new String[3];
            String[] list3 = new String[9];

            for (int x =0; x< list0.length; x++){
                Scanner sc = new Scanner(System.in);
                System.out.println("Input a number here");
                String num0 = sc.next();

                list0[x] = num0;
            }

            for (int i =0; i< list1.length; i++){
                Scanner sc = new Scanner(System.in);
                System.out.println("Input a second number here");
                String num1 = sc.next();

                list1[i] = num1;
            }

//            for (int j =0; j< list1.length; j++){
//                System.out.println(list1[j]);
//            }

            for (int k =0; k< list2.length; k++){
                Scanner sc = new Scanner(System.in);
                System.out.println("Input a third  number here");
                String num2 = sc.next();

                list2[k] = num2;
            }

//            for (int l =0; l< list2.length; l++){
//                System.out.println(list2[l]);
//            }

            for (int y = 0; y < list0.length; y++) {
                list3 [y] = list0[y];
                System.out.print(list3[y] + " ");
            }

            for (int m = 0; m < list1.length; m++) {
                list3 [m] = list1[m];
                System.out.print(list3[m] + " ");
            }

            for (int n = 0; n < list2.length; n++) {
                list3 [n] = list2[n];
                System.out.print(list3[n] + " ");
            }
        }
    }


