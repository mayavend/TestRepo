package notebook;

public class Array2NewList {
    public static void main(String[] args) {
//        # list=[1,2,3,4]
//# * 2
//# Multiply each element by 2 and put each element in a new list.
//# Do print it.
//# Expected output:

        int[] list1 = {1,2,3,4,5,6,7,8,9};
        int[] list2 = new int[9];

//        for (int i =0; i< list1.length; i++){
//            System.out.println(list1[i] *2);
//        }

        int j;
        int count =0;
        int sum =0;
        int m;
            for (j = 0; j < list2.length; j++) {
//                if(j%2 ==0) {
//                    list2[count] = list1[j];
//                    count++;
//                }
                if(list1[j] %2 !=0){

                    list2[count] = list1[j];
                    count++;
                }

            }

            for (m=0; m< list2.length; m++){
                sum= sum + list2[m];

            }
        System.out.println(sum);

        for (int k =0; k<5; k++) {
            System.out.println(list2[k]);
           // System.out.println(list2[k]);
        }

    }
}
