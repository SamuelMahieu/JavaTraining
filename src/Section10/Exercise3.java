package Section10;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {
    public static void main(String[] args) {
        int number;
        int count = 0;
        String answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'higher' if my guess is too low");
        System.out.println("Enter 'lower' if my guess is too high");
        System.out.println("Enter 'correct' if my guess is correct");

        while (true){
            int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
            System.out.println("My guess is "+randomNumber);
            System.out.println("Can you tell me if it's higher, lower or correct: ");
            answer = scanner.next();
            if (answer.equals("correct")){
                System.out.println("That was easy!");
                break;
            }
        }

    }
}
