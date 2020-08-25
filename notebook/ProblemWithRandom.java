package notebook;

import java.util.Random;
import java.util.Scanner;

public class ProblemWithRandom {
    public static void main(String[] args) {
        Random a= new Random();
        int randNumber = a.nextInt(10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 0 to 10:");
        int b = sc.nextInt();

        System.out.println(randNumber);
        if (randNumber == b){
            System.out.println("well guessed");
        }
        else {
            System.out.println("better luck next time!");
        }
    }
}

//# Get a random number between 0 to 10 and store it in a variable.
//        # Ask user to input a number between 0 to 10.
//        # If the random number is equal to the user input, print well guessed
//        # else print better luck next time.