package notebook;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] list1 ={1, 2, 3, 4};
        int[] list2 = new int[4];

        for (int j = 0; j < list2.length; j++) {
            list2[j] = list1[j];
            }

        for (int k= 0; k < list2.length; k++) {
            System.out.println(list2[k]);
        }
    }
}
