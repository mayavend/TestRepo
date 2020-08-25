package Test;

public class MultiplicationTable {
    public static void main(String[] args) {
       //1 2 3 4
       //2 4 6 8
       //3 6 9 12

        //System.out.println("1 2 3 4");
        int row;
        int col;
        int mult;

        for (row=1; row<13; row++) {

            for (col = 1; col < 13; col++) {
                //
                mult=row*col;
                System.out.printf("%4d", mult);
            }
            System.out.println();

        }
        }
}
