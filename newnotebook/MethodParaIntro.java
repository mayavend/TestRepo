package newnotebook;

import java.util.Scanner;

public class MethodParaIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Which operation would you like to perform?");
        String op = sc.next();
        if (op.equals("+")){
            Add(a,b,c,d);
        }
        else if (op.equals("*")) {
            Mult(a, b, c, d);
        }
        else if (op.equals("-")) {
            Sub(a, b, c, d);
        }
        else if (op.equals("/")) {
            Div(a, b, c, d);
        }
    }
    static void Mult(int f, int g, int h, int i){
        int l = f*g*h*i;
        System.out.println(l);
    }
    static void Add(int f, int g, int h, int i){
        int j = f+g+h+i;
        System.out.println(j);
    }
    static void Sub(int f, int g, int h, int i){
        int s = f-g-h-i;
        System.out.println(s);
    }
    static void Div(double f, double g, double h, double i){
        double k = f/g/h/i;
        System.out.println(k);
    }
}
