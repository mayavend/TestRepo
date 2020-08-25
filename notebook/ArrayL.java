package notebook;
import java.util.ArrayList;


public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("M");
        list.add("A");
        list.add("Y");
        list.add("A");
        list.add("V");
        list.add("E");
        list.add("N");

        System.out.println(list.get(2));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

        for (String n: list){
            System.out.print(n);
        }
        System.out.println();

        list.set(4, "5");
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        list.clear();
        System.out.println(list);


    }
}
