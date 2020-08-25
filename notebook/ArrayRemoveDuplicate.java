package notebook;

public class ArrayRemoveDuplicate {

    //1 2 3 4 3 remove last 3


    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,3};
        int[] list2 = new int[4];
        int n=1;
        int i =0;

            while (n< numbers.length-1){
                if (numbers[i] == numbers[i+n]){
                   numbers[i]=0;
                }
                n++;
        }

//        for (int m =0; m< numbers.length; m++) {
//            System.out.println(numbers[m]);
//        }

        for (int k =0; k< list2.length; k++){
            if (numbers[k] != 0){
                list2[k] = numbers[k];
            }
        }
        for (int l =0; l< list2.length; l++) {
            System.out.println(list2[l]);
        }
    }
}
