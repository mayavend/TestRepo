package Test;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // for multi-dimensional arrays. Below is a 2x3 array
        int [][] numbers = new int[2][3];
        numbers[0][1] = 1;
        /* Need to use deepToString and not toString for printing multi-dimensional array as shown below */
        System.out.println(Arrays.deepToString(numbers));
        //The above statement prints [[1,0,0], [0,0,0]]

        // The code below does 3 dimensional array
        int [][][] numbers1 = new int[2][3][5];
        numbers1  [0][0][2] = 1;
        System.out.println(Arrays.deepToString(numbers1));
        //int [][] numbers1 = { {}}

        //Using curly braces to store values in 2x3 array
        int [][] numbers3 = { {1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers3));
    }
}
