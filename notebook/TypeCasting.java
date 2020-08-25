package notebook;

public class TypeCasting {
    public static void main(String[] args) {
//widening
        int a=16;
        double b=a;
        System.out.println(b);
//narrowing
        double c=14.53;
        int d = (int) c;
        System.out.println(d);
    }
}
