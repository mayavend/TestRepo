package notebook;

public class ForMultiplication {
    public static void main(String[] args) {
        int i;
        int prodTF;
        int prodF;
        int prodTN;
        for (i=1; i<=10; i++){
            prodTF = i*24;
            prodF = i*50;
            prodTN = i*29;
            System.out.println(prodTF + " " + prodF + " " + prodTN);
        }
    }
}
