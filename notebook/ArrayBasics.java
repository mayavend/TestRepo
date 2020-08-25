package notebook;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 11;
        numbers[5] = 13;

        System.out.println("The length is " + numbers.length);

        for (int i = numbers.length -1; i>=0; i--){
            System.out.println(numbers[i]);
        }
    }
}
