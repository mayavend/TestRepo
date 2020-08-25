package Test;

public class ForLoopExceptFive {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=30; i++){
            if (i<=9 && i>=5){
                continue;
            }
            System.out.println(i);
        }
    }
}
