package notebook;

public class ArrayCommonElement {
    public static void main(String[] args) {
        int[] list1 = {1,2,3};
        int[] list2 = {3,4,5};

        for (int i =0; i< list1.length; i++){
            for (int j =0; j<list2.length; j++){
                if(list2[j] == list1[i]){
                    System.out.println("The common element is " + list1[i]);
                }
            }
        }
    }
}
