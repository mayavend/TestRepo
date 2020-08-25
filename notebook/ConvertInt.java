package notebook;

public class ConvertInt {
//    #5.a=1.55
//            #b=2.55
//            #c=3.55
//            #d=55
//            #print => There are four numbers 1 , 2 , 3 and 55 to be written
//#in the notebook.


    public static void main(String[] args) {
        double a = 1.55;
        int x = (int) a;
        double b = 2.55;
        int y = (int) b;
        double c = 3.55;
        int z = (int) c;
        int d= 55;
        System.out.println("There are four numbers " + x + ", " + y + ", " + z + ", " + d + " to be written in the notebook");
    }
}
