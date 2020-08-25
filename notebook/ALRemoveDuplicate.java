package notebook;

import java.util.ArrayList;

public class ALRemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(2);
        l1.add(4);
        l1.add(2);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2 = l1;

        for (int i = 0; i < l1.size(); i++) {
            for (int j = i+1; j < l2.size(); j++) {
                if (l1.get(i) == l2.get(j)){
                    l1.remove(i);
                }
            }
        }
        for (Integer n:l1) {
            System.out.println(n);
        }
    }
}
