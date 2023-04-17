package Section6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {
    public static void main(String[] args) {
        int guess;
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number between 1 and 5: ");
        guess = input.nextInt();
        if (guess == randomNumber){
            System.out.println("Correct! Aren´t you lucky");
        }else {
            System.out.println("Hard Luck! Maybe next time");
        }

    }
}
