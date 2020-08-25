package notebook;
//
public class WhileStar {
    public static void main(String[] args) {
//        Print the following patterns using loop :
////*
////**
////***
////****

 String star = "*";
 String i = "*";
 int increment = 0;

        while (increment<4) {
            System.out.println(star);
            System.out.println();
            star = star.concat(i);
            increment++;
        }
    }
}
