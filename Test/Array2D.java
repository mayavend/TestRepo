package Test;

import org.w3c.dom.ls.LSOutput;

public class Array2D {
    public static void main(String[] args) {

        //int numbers[][] = new int[2][3];
        int numbers[][] = {{1, 4}, {9, 16}, {25, 36}};
       for (int i =0; i< 3; i++) {
           for (int j =0; j<2; j++) {
               System.out.print(numbers[i][j] + " ");
           }
           System.out.println();
       }
    }
}
