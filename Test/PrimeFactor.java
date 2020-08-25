package Test;

public class PrimeFactor {
    public static void main(String[] args) {
        int number = 12;
        int n;
        int m;

        for (n=2; n<=(number/2); n++){
            if (n%2 ==0){
                System.out.println(n);
            }
            if (n%2 !=0){
                break;
            }
        }
        System.out.println(n);
    }
}
