package Test;

public class Overloading {
    public static void main(String[] args) {
        //this takes float and returns int
        int result1 = Math.round(1.7F);
        System.out.println(result1);

        //This takes in double and returns long
        long result2 = Math.round(31415134567.93);
        System.out.println(result2);
    }
}

