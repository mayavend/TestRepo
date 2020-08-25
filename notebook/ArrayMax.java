package notebook;

public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int i;
        int max =0;
        int min =0;
        for (i =0; i< numbers.length-1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                max = numbers[i];
            } else {
                max = numbers[i + 1];
            }

        }


            for (i = numbers.length-2; i>=0; i--){
            if (numbers[i] < numbers[i+1]){
                min = numbers[i];
            }
            else{
                min = numbers[i+1];
            }
        }
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
    }
}
