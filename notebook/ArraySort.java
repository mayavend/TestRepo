package notebook;

public class ArraySort {
    // 1,3,4,2 sort to 1 2 3 4

    public static void main(String[] args) {
        int[] l = {2, 5,3,1,4,7};
        //int[] k = new int[4];
        //l[i] > l[i+n] --->

        for (int i =0; i< l.length; i++){
            for (int n=1; n<l.length-i; n++) {
                if (l[i] > l[i + n]){
                    int a = l[i];
                    l[i] = l[i+n];
                    l[i+n] = a;
                }
            }
        }
        for (int m =0; m<l.length; m++){
            System.out.println(l[m]);
        }
    }
}
