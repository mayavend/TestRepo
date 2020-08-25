package Test;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class AirlineIncome {
    public static void main(String[] args) {
      //  int c = a>b?a:b;
      //  int randomIncome= 101000;
        Random r= new Random();
        int randomIncome = r.nextInt(101000);
       // int personIncome= randomIncome;
        String airlineClass= randomIncome>100000? "business class": "economy class";
        System.out.println(randomIncome);
        System.out.println(airlineClass);
    }
}
