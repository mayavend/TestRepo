package notebook;

public class ComparisonLogicalOperators {
    public static void main(String[] args) {
        int a=4;
        if (a==5){
            System.out.println("Hi");
    }
        else {
            System.out.println("Bye");
        }

        int b=3;
        if (b<4 || b>30){
            System.out.println("Hello");
        }

        int c=6;
        if (c<10 && c>4){
            System.out.println("Yay");
        }
    }
}
