package notebook;

import java.util.Scanner;

public class IfElseDog {
//    # Write a Python program to calculate a dog's age in dog's years.
//            # Note: For the first two years, a human year is equal to 10.5 dog years.
    // x<=2, dogAge = 10.5 * humanAge
    // if dogAge >=2, then dogAge = 21+ 4*(humanAge-2)
//            After that, each humna year equals 4 dog years.
//            # Expected Output:
//            #
//            # Input a dog's age in human years: 15
//            # The dog's age in dog's years is 73

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dog's age in human years:");
        int humanAge = sc.nextInt();
        float dogAge =0f;

        if (humanAge >=2){
            dogAge = 21+ 4*(humanAge-2);
        }
        else{
           dogAge = 10.5f * humanAge;
        }
        System.out.println("The dog's age in dog years is: "+ dogAge);

//        if (dogAge<= 2){
//            dogAge = 10.5f * humanAge;
//    }
//        else{
//            dogAge = 4 * humanAge;
//        }
    }
}
