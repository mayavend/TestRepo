package Test;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortSubStr {
        public static void main(String[] args)
        {
            // Our arr contains 8 elements
            int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

            // Sort subarray from index 1 to 4, i.e.,
            // only sort subarray {7, 6, 45, 21} and
            // keep other elements as it is.
            Arrays.sort(arr, 1, 5);

            System.out.println(Arrays.toString(arr));

            Integer[] arr1 = {13, 7, 6, 45, 21, 9, 2, 100};
            Arrays.sort(arr1, Collections.reverseOrder());

            System.out.printf("Modified arr[] : %s",
                    Arrays.toString(arr1));
        }
    }

