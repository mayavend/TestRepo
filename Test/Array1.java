package Test;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 4;
        numbers[3] = 5;
        numbers[4] = 2;
        System.out.println(Arrays.toString(numbers)); // prints 1,3,4,5,2

        // Another way to assign values to arrays
        int [] numbers1 = {6,7,8,10,12,9};
        System.out.println(numbers1.length); //prints 6 because the length is 6

        Arrays.sort(numbers1); //sorts the array numbers1
        System.out.println(numbers1); // prints the memory address which is not what you need
        System.out.println(Arrays.toString(numbers1)); // this prints numbers1 array in correct sorted order
    }
}
