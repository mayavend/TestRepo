package notebook;
import java.util.ArrayList;

public class ArrayIntList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(16);
        numbers.add(25);
        numbers.add(36);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println();
        for (int n:numbers){
            System.out.println(n);
        }
    }
}
